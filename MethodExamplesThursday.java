/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * @author Danielle Neill
 *
 */
public class MethodExamplesThursday {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // start of main

		int age;
		Scanner scanner = new Scanner(System.in);

		age = scanner.nextInt();
		System.out.println("What age are you?");

		ageComment(age);

		// close scanner
		scanner.close();
	} // end of main

	public static void ageComment(int age) {

		if (age >= 18) {
			System.out.println("You are old!");
		} else {
			System.out.println("Young puppy");
		}
	} // end of age method

}
