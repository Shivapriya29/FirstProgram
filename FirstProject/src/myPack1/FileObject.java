package myPack1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileObject {
	int fileoperations(String path) {
		int inputCase = 0;
		Scanner sc = new Scanner(System.in);
		File file = new File("");
		String fileName ;
		do {
			System.out.println("Choose Option :\n \n 1.Add file\n 2.Delete file\n 3.Display Files start with same name . \n 4. Return to previous menu :\n 5. Terminate the Application \n");

			inputCase = sc.nextInt();
			switch(inputCase) {
			case 1: //Creation of File in the given folder.
				System.out.println("Enter filename to create :");
				fileName = sc.next();
				file = new File(path, fileName);
				 try {
					if(file.createNewFile()) {
						System.out.println("File created Sucessful .");
					}
					else
						System.out.println("File created Unsucessful ");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2: // Deletion of File from the given folder.
				System.out.println("Enter filename to delete :");
			    fileName = sc.next();
				file = new File(path, fileName);
				if(file.delete())
		        {
		            System.out.println("File deleted successfully"+ file.getName());
		        }
		        else
		        {
		            System.out.println("Failed to delete the file");
		        }

				break;
			case 3: // Display the Files with given name in the given folder.
				System.out.println("Enter filename to Display :");
			    String filname = sc.next();
				File folder = new File(path);
				File[] filelist = folder.listFiles();
				ArrayList <String> list = new ArrayList<String>();
				for(File f:filelist) {
					list.add(f.getName());
				}
				System.out.println("Files with fileName start with :" + filname );
				for(String l:list) {
					if(l.contains(filname))
						System.out.println(l);
				}

				break;

			case 4: // Return to Previous Menu
				inputCase = 5;
				break;
			case 5:  // Terminate the application .
				return 1;

			default :
				System.out.println(" Enter correct inputCase and retry ..... \n");
				break;
			}

		}while(inputCase != 5) ;

		return 0;
	}

}
