/*
 * Prompt: (Financial application: compound value) Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account
 * becomes
 * 100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * 
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month. (In Exercise 5.30, you will use a
 * loop to simplify the code and display the account value for any month.)
 * 
 * Sample run:
 * Enter the monthly saving amount: 100
 * After the sixth month, the account value is $608.81
 */

import java.util.Scanner;

public class Exercise02_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int savingAmount;
		double compound, interest;
		interest = 1 + 0.00417;
		
		System.out.print("Enter the monthly saving amount: ");
		savingAmount = input.nextInt();
		
		compound = savingAmount * interest;
		compound = (savingAmount + compound) * interest;
		compound = (savingAmount + compound) * interest;
		compound = (savingAmount + compound) * interest;
		compound = (savingAmount + compound) * interest;
		compound = (savingAmount + compound) * interest;
		
		System.out.println("After the sixth month, the account value is " + compound);
	}
}