/*
 * Prompt: (Convert feet into meters) Write a program that reads a number in feet,
 * converts it to meters, and displays the result.
 * One foot is 0.305 meter. Here is a sample run:
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325 meters
 */
import java.util.Scanner;

public class Exercise02_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double feet, meters;
		
		System.out.print("Enter a value for feet: ");
		feet = input.nextDouble();
		
		meters = feet * 0.305;
		
		System.out.println(feet + " feet is " + meters + " meters.");
	}
}
