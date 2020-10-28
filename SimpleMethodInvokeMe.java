/**
 * 
 */
package methods;

/**
 * @author Danielle Neill
 *
 */
public class SimpleMethodInvokeMe {

	/**
	 * Start point for program - the first methid
	 * @param args
	 */
	public static void main(String[] args) {
		// method call invoked from within the same class
		// we can call this method directly because it is declared as static
		invokeMe();
	}
	/**
	 * Method outputs a message to screen when invoked
	 */
	public static void invokeMe () {
		System.out.println("Ouch, that hurt!");
	}
}