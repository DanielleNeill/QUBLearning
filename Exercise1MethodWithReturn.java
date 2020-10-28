/**
 * 
 */
package methods;

/**
 * @author Danielle Neill
 *
 */
public class Exercise1MethodWithReturn {

	/**
	 * Start of program with a method that adds two numbers together.
	 * The result should be returned from the method and displayed ...
	 * @param args
	 */
	public static void main(String[] args) { // start of main method
		// invoke method call as part of a print statement
		System.out.println("The total is " +total(3, 8));
	} // end of main method
	
	/**
	 * returns the total of 2 numbers between passed parameters
	 * @param number1
	 * @param number2
	 * @return number1 and number 2 added together
	 */
public static int total (int number1, int number2) { // start of total method
	int total;
	
	total = number1+number2;
	// return total of number1 and number2#
	
	return total;
} // end of total method
} // end of class
