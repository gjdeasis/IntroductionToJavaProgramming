/*
 * Prompt: (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers).
*/

package exercise;

public class ExerciseOneTen{
	public static void main(String[] args) {
		System.out.println(((14/45.5) * 60)/1.6);
		/*
		 * 14/45.5 to get the km/min
		 * multiply that number by 60 to get km/hr
		 * divide that number by 1.6 to get miles/hr
		 */
	}
}
