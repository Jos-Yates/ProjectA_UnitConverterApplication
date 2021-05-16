package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
			while (menuSelection != 4) {
				System.out.println("Please select an option:");
				System.out.println("1. Inches to Feet");
				System.out.println("2. Feet to Yards");
				System.out.println("3. Yards to Miles");
				System.out.println("4. Quit");
				break;
			}
			Scanner scanner = new Scanner(System.in);
			menuSelection = scanner.nextInt();
			switch (menuSelection) {
			case 1: {
				System.out.println("Please input inches to convert:");
				double inches;
				inches = scanner.nextInt();
				System.out.println("The total feet from " + inches + " inch(es) is " + (inches / 12) + " feet.");
				break;
			}
			case 2: {
				System.out.println("Please input feet to convert:");
				double feet;
				feet = scanner.nextInt();
				System.out.println("The total yard(s) from " + feet + " feet is " + (feet / 3) + " yard(s).");
				break;
			}
			case 3: {
				System.out.println("Please input yards to convert:");
				double yards;
				yards = scanner.nextInt();
				System.out.println("The total mile(s) from " + yards + " yard(s) is " + (yards / 1760) + " mile(s).");
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
