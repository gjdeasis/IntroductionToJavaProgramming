/*
 * Prompt: (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and
 * dividing by the square of your height in meters. Write a program that prompts the
 * user to enter a weight in pounds and height in inches and displays the BMI. Note
 * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * 
 * Here is a sample run:
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * BMI is 26.8573
 */

import java.util.Scanner;

public class Exercise02_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kg = 0.45359237, meters = 0.0254, pounds, inches, bmi;
		
		System.out.print("Enter weight in pounds: ");
		pounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		inches = input.nextDouble();
		
		kg = kg * pounds;
		meters = meters * inches;
		bmi = kg / Math.pow(meters, 2);
		
		System.out.println("BMI is " + bmi);	
	}
}
