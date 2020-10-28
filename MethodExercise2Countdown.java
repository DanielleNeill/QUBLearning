/**
 * 
 */
package methods;
/**
 * @author Danielle Neill
 *
 */
public class MethodExercise2Countdown {
	/**
	 * Start of program
	 * @param args
	 */
	public static void main(String[] args) { // start of main method
		countDown(17,2);
	} // end of main method

	/**
	 * Create a method that starts a countdown ending at 0
	 * @param perameter start - value to start countdown at
	 */
	public static void countDown (int start, int end) { // start of my method
		for (int loop=start; loop>=end; loop--) {
		System.out.println(loop);
		} //end of for
	} // end of my method
	
} // end of class
