/*
 * @author: Kevin Chung
 */
package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Circle Tester");

		String toContinue = "y";
		int numberofCircles = 0;

		while (toContinue.equalsIgnoreCase("y")) {
			double userInput = Validator.getDouble(scan, "Enter radius: ");

			Circle newCircle = new Circle(userInput);
			System.out.println(newCircle.getFormattedCircumference());
			System.out.println(newCircle.getFormmatedArea());

			System.out.println("Continue? (y/n)");
			toContinue = scan.nextLine().substring(0, 1);
			
			numberofCircles++;
		}

		System.out.println("The number of circles you entered is: " + numberofCircles + ".");
		System.out.println("Goodbye!");

		scan.close();
	}

}
