/**
 * 
 */
package methods;

/**
 *
 * @author Danielle Neill
 *
 */
public class ParameterisedMethod {
	/**
	 * Start of program
	 * @param args
	 */
	public static void main(String[] args) { // start of main method
		min(15, 89);
	} // end of main method

	/**
	 * smallest number
	 * @param number1
	 * @param number2
	 */
	public static void min (int number1 ,int number2) { // start of my min method
		if (number1>number2){
			System.out.printf("%d is bigger than %d", number1, number2);
			} else if (number1<number2){
				System.out.printf("%d is smaller than %d",number1, number2);
				} else {
					System.out.printf("%d is same as %d",number1, number2);
					}
	} // end of my min method
	
/**
 * averages 
 * @param a
 * @param b
 * @param c
 * @param d
 */
	public static void average (int a, int b, int c, int d) { // start of my avg method
		int total = a+b+c+d;
		double avg = (double)total/4;
		System.out.println(avg);
	}// end of my avg method
	
} // end of class
