package Countries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePaths {
	public static void main(String[] args) throws IOException {
		
		/*
		 * create a file
		 * 
		 */

		Path path1 = Paths.get("myfile.txt");
		if (Files.notExists(path1)) {
			Files.createFile(path1);
		}
		System.out.println(path1);

		Path path2 = Paths.get("src/newfile.txt");
		if (!Files.exists(path2)) {
			Files.createFile(path2);
		}
		System.out.println(path2);

		// windows - onedrive
		Path path3 = Paths.get(System.getProperty("user.home") + "/Desktop/deskfile.txt");

		if (Files.notExists(path3)) {
			Files.createFile(path3);
		}
		System.out.println(path3);
		
		/*
		 * create directory
		 * 
		 */
		
		// relative path
		String dirPath = "resources";
		
		// absolute path
		//dirPath = "/Users/kyled/eclipse-workspace/lesson-plan/resources";
		
		Path folderPath = Paths.get(dirPath);
		
		Files.createDirectories(folderPath);
		System.out.println(folderPath);
		
		
		Path path4 = Paths.get(folderPath+"/bestfile.txt");
		
		if(Files.notExists(path4)) {
			Files.createFile(path4);
		}
		System.out.println(path4);
		

	}

}



