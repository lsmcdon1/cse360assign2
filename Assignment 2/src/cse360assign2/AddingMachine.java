package cse360assign2;
/**
 * Performs basic add and subtract calculations and maintains calculation
 * history accessible through a toString method. 
 * 
 * This class includes an add and subtract method designed to perform 
 * respective calculations on a rolling total. toString allows the user 
 * to print a history of performed calculations to console. clear allows
 * the user to reset the calculations to 0.

 * 
 * <br><br>
 *  
 * Name: Liam McDonald <br>
 * Course: CSE 360 <br>
 * Assignment: 2 <br><br>
 * 
 * @author Liam McDonald
 */
public class AddingMachine {

	private int total;
	
	/** 
	 * Constructor for the AddingMachine class. 
	 * 
	 * Not necessary, but included
	 * based on convention. Initializes the rolling total to 0 for clarity. 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns integer value for total after calculations have been performed.
	 * 
	 * 
	 * @return		Integer value that represents total rolling value
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Method that adds parameter 'value' to total rolling value.
	 * @param value	value to be added to total rolling value.
	 */
	public void add (int value) {
		
	}
	
	
	/**
	 * Method that subtracts parameter 'value' from total rolling value.
	 * @param value	value to be subtracted from total rolling value.
	 */
	public void subtract (int value) {
		
	}
		
	/**
	 * Method that returns a string containing the history of operations. 
	 * 
	 * @return		String containing history of operations. 
	 */
	public String toString () {
		return "";
	}

	/**
	 * Method that clears calulation history and resets total rolling value
	 * to zero. 
	 */
	public void clear() {
	
	}
}