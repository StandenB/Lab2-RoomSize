package co.grandcircus.labs;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double length, width, height, area, perimeter, volume;
		String cont;

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println("");

		// Start loop

		do {

			System.out.print("Enter Length: ");
			length = scnr.nextDouble();

			System.out.print("\nEnter Width: ");
			width = scnr.nextDouble();

			System.out.print("\nEnter Height: ");
			height = scnr.nextDouble();

			area = 1 * length * width;
			perimeter = 2 * length + 2 * width;
			volume = 1 * area * height;

			System.out.print("Area: ");
			System.out.printf("%.1f", area);

			System.out.print("\nPerimeter: ");
			System.out.printf("%.1f", perimeter);

			System.out.print("\nVolume: ");
			System.out.printf("%.1f", volume);
			System.out.println("");
			System.out.println("");

			System.out.print("Continue? (y/n): ");
			cont = scnr.next();
			System.out.println("");

		} while (cont.equals("y"));

		// testing changes in git
	}

}
