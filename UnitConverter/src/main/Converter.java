package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
			while (menuSelection != 4) {
				System.out.println("Please select an option:");
				System.out.println("1. Inches");
				System.out.println("2. Feet");
				System.out.println("3. Yards");
				System.out.println("4. Quit");
			//Removing the break; here and including the scanner and Switch statement inside the while loop allows it to repeat itself; so long as the punched in number isn't 4
			Scanner scanner = new Scanner(System.in);
			menuSelection = scanner.nextInt();
			switch (menuSelection) {
			case 1: {
				callInches(); //Here on out the methods for each conversion will be call with the converted measurement after
				break;
			}
			case 2: {
				callFeet();
				break;
			}
			case 3: {
				callYards();
				break;
			}
			case 4: {
				System.out.println("Have a nice day!");
				break;
			}
			default: {
				System.out.println("Error! Please place a correct input!");
				break;
			}
		}
	}
	}

	private static void callInches() {
		int menuSelection2 = 0; //MenuSelection2 for Inch Conversion
		while (menuSelection2 != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Inches to Feet");
			System.out.println("2. Inches to Yards");
			System.out.println("3. Inches to Miles");
			System.out.println("4. Go Back");
			
		Scanner scanner2 = new Scanner(System.in); //Similarly, all new scanners will be marked scanner2, scanner3, etc.; that way as to avoid any potential goofups I'm not aware of
		menuSelection2 = scanner2.nextInt();
		switch (menuSelection2) {
		case 1: {
			System.out.println("Please input inches to convert:");
			double inches;
			inches = scanner2.nextInt();
			System.out.println("The total feet from " + inches + " inch(es) is " + (inches / 12) + " feet.");
			break;
		}
		case 2: {
			System.out.println("Please input inches to convert:");
			double inches;
			inches = scanner2.nextInt();
			System.out.println("The total yard(s) from " + inches + " inch(es) is " + (inches / 36) + " yard(s).");
			break;
		}
		case 3: {
			System.out.println("Please input inches to convert:");
			double inches;
			inches = scanner2.nextInt();
			System.out.println("The total mile(s) from " + inches + " inch(es) is " + (inches / 63360) + " mile(s).");
			break;
		}
		case 4: {
			break;
		}
		default: {
			System.out.println("Error! Please place a correct input!");
			break;
		}
		}
	}
	}
	private static void callFeet() {
		int menuSelection3 = 0; //MenuSelection3 for Feet Conversion
		while (menuSelection3 != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Feet to Inches");
			System.out.println("2. Feet to Yards");
			System.out.println("3. Feet to Miles");
			System.out.println("4. Go Back");

		Scanner scanner3 = new Scanner(System.in);
		menuSelection3 = scanner3.nextInt();
		switch (menuSelection3) {
		case 1: {
			System.out.println("Please input feet to convert:");
			double feet;
			feet = scanner3.nextInt();
			System.out.println("The total inch(es) from " + feet + " feet is " + (feet * 12) + " inch(es).");
			break;
		}
		case 2:{
			System.out.println("Please input feet to convert:");
			double feet;
			feet = scanner3.nextInt();
			System.out.println("The total yard(s) from " + feet + " feet is " + (feet / 3) + " yard(s).");
			break;
		}
		case 3:{
			System.out.println("Please input feet to convert:");
			double feet;
			feet = scanner3.nextInt();
			System.out.println("The total mile(es) from " + feet + " feet is " + (feet / 5280) + " mile(es).");
			break;
		}
		case 4: {
			break;
		}
		default: {
			System.out.println("Error! Please place a correct input!");
			break;
		}
	}
	}
}
	private static void callYards() {
		int menuSelection4 = 0; //MenuSelection4 for Yard Conversion
		while (menuSelection4 != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Yards to Inches");
			System.out.println("2. Yards to Feet");
			System.out.println("3. Yards to Miles");
			System.out.println("4. Go Back");

		Scanner scanner4 = new Scanner(System.in);
		menuSelection4 = scanner4.nextInt();
		switch (menuSelection4) {
		case 1: {
			System.out.println("Please input yards to convert:");
			double yards;
			yards = scanner4.nextInt();
			System.out.println("The total inch(es) from " + yards + " yard(s) is " + (yards * 36) + " inch(es).");
			break;
		}
		case 2:{
			System.out.println("Please input yards to convert:");
			double yards;
			yards = scanner4.nextInt();
			System.out.println("The total feet from " + yards + " yard(s) is " + (yards * 3) + " feet.");
			break;
		}
		case 3:{
			System.out.println("Please input yards to convert:");
			double yards;
			yards = scanner4.nextInt();
			System.out.println("The total mile(s) from " + yards + " yard(s) is " + (yards / 1760) + " mile(s).");
			break;
		}
		case 4: {
			break;
		}
		default: {
			System.out.println("Error! Please place a correct input!");
			break;
		}
		}
		}
}
}