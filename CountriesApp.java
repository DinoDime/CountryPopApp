import java.io.*;
import java.util.*;

public class CountriesApp {
	public static void main(String[] args) {
		Scanner JavaInput = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");
		while(true) {
			System.out.println("1 - See the list of countries");
			System.out.println("2 - Add a country");
			System.out.println("3 - Exit");
			System.out.println("Enter a menu number: ");
			String userSelection = JavaInput.nextLine();
			if (Validator.ifValidMenuChoice(userSelection)) {
				if (userSelection.equals("3")) {
					System.out.println("Goodbye");
					break;
				}
				else if (userSelection.equals("1")) {
					printTextFile();
				}
				else if(userSelection.equals("2")) {
					System.out.println("Enter country: ");
					String newCountry = JavaInput.nextLine();
					System.out.println("Enter population: ");
					String newPopulation = JavaInput.nextLine();
					fileAppend("\n" + newCountry + " " + newPopulation);
				}
					}
			else{
				System.out.println("Invalid input. Would you like to try again? (y/n)");
				String userContinue = JavaInput.nextLine();
				if (userContinue.contains("y")) {
					continue;
				}
				else {
					System.out.println("Goodbye");
					break;
				}
				
			}
	}
}
	public static void printTextFile() {
		FileReader fr = null;
		try {
			fr = new FileReader("/home/jess/eclipse-workspace/WorldPopulationApp/countries.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	    int i; 
	    try {
			while ((i=fr.read()) != -1) 
				System.out.print((char) i);
				System.out.println(" ");
				System.out.println(" ");
	    } catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void fileAppend(String countryToAdd) {
		File file = new File("countries.txt");
		FileWriter fr = null;
		try {
			fr = new FileWriter(file, true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			fr.write(countryToAdd);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}