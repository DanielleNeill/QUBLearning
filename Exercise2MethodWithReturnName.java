/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * 
 * @author Danielle Neill
 *
 */
public class Exercise2MethodWithReturnName {

	/**
	 * Start of application with method that prompts the user for full name. Name
	 * should be returned from method & displayed to screen “Hello Danielle ”
	 * 
	 * @param args
	 */
	public static void main(String[] args) { // start of main method
		// declaration
		String userName;
		// instantiate user name by invoking method
		userName = getUserName();

		if (userName.length() == 0) { // start of selection statement
			System.out.println("What, you dont have a name?");
		} else {
			System.out.println("Hello " + userName);
		} // end of selection statement
	} // end of main method

	public static String getUserName() { // start of name method
		String userName;
		userName = null;
		// instantiate scanner
		Scanner scanner = new Scanner(System.in);
		// prompt user for name
		System.out.println("Please enter your name...");
		// collect information from user
		userName = scanner.nextLine();
		// close resource
		scanner.close();
		// return name
		return userName;
	} // end of userName method

}// end of class
