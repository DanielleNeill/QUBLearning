/**
 * 
 */
package methods;
/**
 * @author Danielle Neill
 *
 */
public class RecepShoeSize {
	/**
	 * Start of program
	 * @param args
	 */
	public static void main(String[] args) { //start of main method
		// main body
		System.out.println("The average shoe size is " +averageShoeSize(5, 4, 9, 8));
	} // end of main method

	
	/**
	 * Method that will return the average shoe size
	 * shoe sizes should be passed as parameters
	 */
		public static int averageShoeSize (int shoe1, int shoe2, int shoe3, int shoe4) {
			int total, average;
			total = shoe1+shoe2+shoe3+shoe4;
			average = total/4;
			// return statement
			return average;
		} // end of shoe average method
		
} // end of class
