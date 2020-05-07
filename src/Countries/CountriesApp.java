package Countries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Countries.FileHelper;
import Countries.Countries;
import Countries.CountriesLineConverter;

public class CountriesApp {
	
	private static FileHelper<Countries> helper = new FileHelper<>("countries.txt", new CountriesLineConverter());

	private static Path filePath = Paths.get("countries.txt");
	
	public static void main(String[] args) {
		

//		Path filePath = Paths.get("countries.txt");
//		if(Files.notExists(filePath)) {
//			try {
//				Files.createFile(filePath);
//			} catch (IOException e) {
//				e.printStackTrace();
//				System.out.println("File not successfully created.");
//			}
//		}
		
	
//--------------------------------------------------------------
		//Main Method
		helper.rewrite(Arrays.asList(new Countries("United States", 350000000), new Countries("Peru", 32000000), new Countries("Russia", 136000000), new Countries("Mexico",129000000)));

		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Countries of Name and Population:");
		System.out.println("Enter 1: For a List of Countries and their Population");
		System.out.println("Enter 2: To add a Country and Population to the List");
		System.out.println("Enter 3: To quit.");

		while (true) {
			System.out.println("Enter a command: ");
			int command = scnr.nextInt();

			if (command == 3) {
				System.out.println("Remind yourself; you are not a Quitter.");
				break;
			}else if (command == 1) {
				System.out.println("Countries by Name and Population:");
				
				//needed to edit countries constructor to have proper format of println
				List<Countries> allCountries = helper.readAll();
				for(Countries c : allCountries) {
					System.out.println(c);
				}
			    //This reads the countries and populations all in one array
				//List<String> things = readLinesOfFile();
				//System.out.println(things);
			}else if (command == 2) {
				System.out.println("Type a Country and press Enter:");
				String clear=scnr.nextLine();
				String countries =scnr.nextLine();
				System.out.println("Type the Countries Population and press Enter:");
				int pop =scnr.nextInt();
				helper.append(new Countries(countries,pop));
			}else {
				System.out.println("Invalid command.");
			}
		}
		
		//List<Countries> allCountries = helper.readAll();
		    //for(int i = 0; i < allCountries.size(); i++) {
		    	
		    	
		    }
		
		
	//-------------------------------------------------------------
		
		
		
		//List<String> allLines = readLinesOfFile();

		//System.out.println(allLines);


	public static List<String> readLinesOfFile() {

		// List<String> entireFile;
		try {
			// entireFile = Files.readAllLines(filePath);
			return Files.readAllLines(filePath);

		} catch (IOException e) {
			e.printStackTrace();

			System.out.println("Unable to read file.");

			return new ArrayList<>();
		}

	}

	public static void appendLineToFile(String line) {

		// Files.write requires a list of lines
		List<String> lines = Collections.singletonList(line);

		try {

			Files.write(filePath, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

		} catch (IOException e) {
			e.printStackTrace();

			System.out.println("Unable to write to file.");
		}

	}

}
	