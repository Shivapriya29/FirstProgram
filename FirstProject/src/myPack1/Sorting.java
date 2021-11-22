package myPack1;
import java.io.File;
import java.util.Arrays;

public class Sorting {
	public void Sorting(String dirPath)
    {

        File folder = new File(dirPath);
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();

            Arrays.sort(fileList);

            System.out.println("\nTotal number of items present in the directory: " + fileList.length );


            // Lists only files since we have applied file filter
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

        }
}
}
