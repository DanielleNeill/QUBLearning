/**
 * 
 */
package methods;

/**
 * @author Danielle Neill
 *
 */
public class PrintNameParameter {
	/**
	 * start point for program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("I am the start of main method");
		printNameToScreen(8, "Milo"); // parameter arguments must be in the correct order!
		System.out.println("I am the end of main method");
	} // end of main

/**
 * This method prints the name to screen - below shows the parameters passed in
 * @param count  - specified number of times to print name
 * @param name - specific name to be printed
 */
	public static void printNameToScreen(int count, String name) {

		for (int loop = 1; loop <= count; loop++) {
			System.out.println(name);
		} // end of for

	} // end of print method
} // end of class
