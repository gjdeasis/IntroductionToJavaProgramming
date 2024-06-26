/*
 * Prompt:(Compute the volume of a cylinder) Write a program that reads in the radius 
 * and length of a cylinder and computes the area and volume using the following formulas:
 * area = radius * radius * p
 * volume = area * length
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.0331
 * The volume is 1140.4
 */

import java.util.Scanner;

public class Exercise02_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double area, volume, radius, length;
		
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		
		area = radius * radius * 3.14159;
		volume = area * length;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
	}
}
