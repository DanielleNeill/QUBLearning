/**
 * 
 */
package methods;

/**
 * Program to calculate the year I turn 100 The method should be dynamic and
 * able to update annually
 * 
 * @author Danielle Neill
 *
 */
public class YearTurning100Method {
	/**
	 * This is where the program starts...
	 * 
	 * @param args
	 */
	public static void main(String[] args) { // start of main method
		// main method body
		yearTurning100(31); // can enter any int age in brackets
	} // end of main method
	/**
	 * Method to work out year turn 100
	 */
	public static void yearTurning100(int currentAge) { // start of method for age
		// declare parameters
		int  currentYear, yearIAm100;
		//currentAge = 31; it would be better to pass the age into the method (^^parameter passing)
		currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		yearIAm100 = 100 - currentAge + currentYear;
		System.out.println("The year i will turn 100 is " +yearIAm100);
	} // end of age method
} // end of class
