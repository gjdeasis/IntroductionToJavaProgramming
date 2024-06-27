/*
 * Prompt: (Physics: acceleration) Average acceleration is defined as the change of velocity 
 * divided by the time taken to make the change, as shown in the following formula:
 * a = (v1 - v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration.
 * 
 * Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */

import java.util.Scanner;
public class Exercise02_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, v0, v1, t;
		
		System.out.print("Enter v0, v1, and t: ");
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		
		a = (v1 - v0) / t;
		
		System.out.println("The average acceleration is " + a);
		

	}

}
