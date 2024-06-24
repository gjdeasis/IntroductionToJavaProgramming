/*
 * Prompt: (Sum the digits in an integer) Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 * sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * 
 * Here is a sample run:
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 */

import java.util.Scanner;

public class Exercise02_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, ones, tens, hundreds, remainingNumber, sum;
		
		System.out.print("Enter an number between 0 and 1000: ");
		number = input.nextInt();
		
		ones = number % 10;
		remainingNumber = number/10;
		tens = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		hundreds = remainingNumber % 10;
		
		sum = ones + tens + hundreds;
		
		System.out.println("The sum of all digits in " + number + " is " + sum);
		
	}
}
