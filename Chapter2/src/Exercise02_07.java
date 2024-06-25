/*
 * Prompt: (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. Here is a sample run:
 * 
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 */

import java.util.Scanner;

public class Exercise02_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int years, days, minutes, time;
		
		System.out.print("Enter the number of minutes: ");
		minutes = input.nextInt();
		
		time = minutes;		
		years = time / (24 * 60 * 365);
		time = time % (24 * 60 * 365);
		days = time / (24 * 60);

		System.out.println(minutes + " minutes is approvimately " + years + " years and " + days + " days");
	}
}
