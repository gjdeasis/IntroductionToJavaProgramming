/*
 * Prompt: (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a hexagon is
 * Area = ((3 * square root of 3) / 2) * s^2
 * where s is the length of a side.
 * 
 * Here is a sample run:
 * Enter the side: 5.5
 * The area of the hexagon is 78.5895
 */

import java.util.Scanner;

public class Exercise02_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double area, s;
		
		System.out.print("Enter the side: ");
		s = input.nextDouble();
		
		area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(s, 2);
		
		System.out.println("Enter the area of the hexagon is " + area);
	}
}
