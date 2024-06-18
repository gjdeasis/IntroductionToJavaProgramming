/*
 * Prompt: (Convert Celsius to Fahrenheit) Write a program that reads a Celsius
 * degree in a double value from the console, then converts it to Fahrenheit
 * and displays the result. The formula for the conversion is as follows: 
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * 
 * Sample Run:
 * Enter a degree in Celsius: 43
 * 43 Celsius is 109.4 Fahrenheit
 */




/*
 * Since this exercise requires you to get an input from the user,
 * you will need to use a Scanner. Import the Scanner from the java.util package.
 * (You can also so a generic import by writing java.util.* (aka wildcard import)
 */
import java.util.Scanner;


public class Exercise02_01 {
	public static void main(String[] args) {
		//create the scanner object, assigning it to the variable input
		Scanner input = new Scanner(System.in);
		//define variables as doubles
		double celsius;
		double fahrenheit;
		
		System.out.print("Enter a degree in Celsius: ");
		celsius = input.nextInt(); //assign input to celsius variable
		fahrenheit = (9.0 / 5) * celsius + 32; //computation
		
		System.out.println(celsius + " degrees Celcius is " + fahrenheit + " degrees Fahrenheit");
	}
}
