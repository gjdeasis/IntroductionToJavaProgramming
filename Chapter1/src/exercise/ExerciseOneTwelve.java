/*
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 */
package exercise;

public class ExerciseOneTwelve {
	
	public static void main(String[] args) {
		
		System.out.println(((24 / (60 + 40 + 35 / 60.0)) * 60) * 1.6);
		/*
		 * 1) Get the number of miles per minute 24/(60 + 40 + 35/60.0)
		 * 2) Convert number of miles per hour * 60
		 * 3) Convert miles per hour to kilometers per hour * 1.6
		 */
	}
}