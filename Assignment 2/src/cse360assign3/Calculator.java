package cse360assign3;
/**
 * Extends AddingMachine to add multiplication, division, and power \
 * functionality.  
 * 
 * This class extends AddingMachine, which contains 
 * an add and subtract method designed to perform 
 * respective calculations on a rolling total. Calculator allows for multiplication, 
 * division and power operations, as well as all the functionality designed in 
 * AddingMachine. As inherited, the toString method allows the user 
 * to print a history of performed calculations to console. clear allows
 * the user to reset the calculations to 0.

 * 
 * <br><br>
 *  
 * Name: Liam McDonald <br>
 * Course: CSE 360 <br>
 * Assignment: 3 <br><br>
 * 
 * @author Liam McDonald
 */

public class Calculator extends AddingMachine {
	
	
	/**
	 * Constructor for the Calculator class. 
	 * 
	 * Included on convention, however no real functionality is given.
	 * Super is called to set total and history to default states. 
	 */
	public Calculator() {
		super();
	}
	
	
	/**
	 * Method that will multiply current rolling value by the parameter 
	 * 'value'.
	 * @param value	value to be multiplied to total rolling value. 
	 */
	public void multiply(int value) {
		total *= value;
		history += " * " + value;
	}
	
	
	/**
	 * Method that divides current rolling value by parameter 'value'.
	 * 
	 * If division by zero is attempted, the total rolling value will be set
	 * equal to zero, but the calculation history will remain. 
	 * 
	 * @param value	value by which the total rolling value is divided. 
	 */
	public void divide(int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
		history += " / " + value;
	}
	
	
	/**
	 * Method that raises current rolling value by parameter 'value'. 
	 * 
	 * If 'value' is a negative number, the total rolling value will be set to 
	 * zero, but the calculation history will remain. 
	 * @param value
	 */
	public void power(int value) {
		if (value < 0) {
			total = 0;
		}
		else {
			total ^= value;
		}
		history += " ^ " + value;
	}
}		
