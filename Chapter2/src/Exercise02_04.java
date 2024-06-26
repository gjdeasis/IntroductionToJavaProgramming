/*
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilograms.
 * Here is a sample run:
 * Enter a number in pounds: 55.5
 * 55.5 pounds is 25.197 kilograms
 */

import java.util.Scanner;

public class Exercise02_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pounds, kilograms;
		
		System.out.print("Enter a number in pounds: ");
		pounds = input.nextDouble();
		
		kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	}
}
