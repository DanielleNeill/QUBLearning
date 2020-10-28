/**
 * 
 */
package methods;
/**
 * Create a method that when invoked with write your name to screen
 * @author Danielle Neill
 *
 */
public class ThursdayMethods {
	/**
	 * @param args
	 */
	public static void main(String[] args) { // start of main method
		System.out.println("in main");
		ThursdayMethods.printNameToScreen();
		System.out.println("end of main");
	} // end of main method
	/** 
	 * Method prints name to screen
	 */
	public static void printNameToScreen() {
		int loop=1; //changing scope so can use outside for statement - keep semi colon at start of for
		for (; loop<11; loop++) {// print name 10x using a for loop
		System.out.println("Danielle");
		
		System.out.println("Exit point of loop " +loop);
	}}// end of print method
	
	} // end of class
