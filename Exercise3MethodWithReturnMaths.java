/**
 * 
 */
package methods;

/**
 * @author Danielle Neill
 *
 */
public class Exercise3MethodWithReturnMaths {
	/**
	 * Start of program with method using Math.pow (double number, double exponent)
	 * to calculate a number multiplied a specific number of times by itself. 
	 * @param args
	 */
	public static void main(String[] args) { // start of main method
		//  main body
		System.out.println(exponentCalculation(5, 8));
	} // end of main method

	public static double exponentCalculation (double number, double power) { // start of my method
	// The number &exponent should be passed to the method as a parameter argument.
		return Math.pow(number, power);
	} // end of my method
	
} // end of class
