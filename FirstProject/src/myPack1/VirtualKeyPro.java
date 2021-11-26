package myPack1;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKeyPro {

	public static void main(String[] args) {
		
		System.out.println("Hello SIMPLILEARN");
		System.out.println("WellCome To MY Program.");
		System.out.println("SHIVAPRIYA HERE.");

		// Creation of Folder

		  System.out.println("Enter the path where you want to create a folder: ");  
	      Scanner sc = new Scanner(System.in);  
	      String path = sc.next();  
	      //Using Scanner class to get the folder name from the user  
	      System.out.println("Enter the name of the main Directory "); 
	      String folder = sc.next();;
	      path = path+folder;  

		  File f1 = new File(path);        
	      //Creating a folder using mkdir() method  

		  if (!f1.exists()){
			    f1.mkdirs();
			}

	      if(f1.isDirectory()){  
	         System.out.println("Folder is created successfully .\n\n");  
	      }else{  
	         System.out.println("Error Found ! \n\n"); 

	       }


	      System.out.println("Welcome to the Application Fuctionality . \n");
	      int  inputCase;
	      Sorting sort = new Sorting();
	      int terminateflag = 0;

	      do {
	    	  System.out.println("Choose Option :\n\n 1. Retrieve files from main Folder in ascending order \n 2. File Operations \n 3. Terminate the program sucesfull\n");
	    	  inputCase = sc.nextInt();

	    	  switch(inputCase) {

	    	  case 1:
	    		  sort.Sorting(path);
	    		  break;

	    	  case 2: 
	    		  System.out.println("File Operations \n");
	    		  FileObject obj = new FileObject();
	    		  terminateflag = obj.fileoperations(path);
	    		  break;

	    	  case 3:  // it Terminate The Applications .
	    		  break;

	    	  default :
	    		  System.out.println("Enter inputCase correctly and retry .... \n\n");

	    	  }

	    	  if(terminateflag == 1)
	    		  inputCase = 3;


	      } while(inputCase != 3);


	      System.out.println("Application sucessfully Terminated !!");


      }
}

