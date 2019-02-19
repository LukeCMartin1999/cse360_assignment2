
package cse360assign2;
/**
 * @author Luke C. Martin
 * This class performs basic arithmetic operations such as,
 * addition, subtraction, multiplication, and division.
 * it takes in a private int variable of total. It also has the 
 * private string history to show the previous operations 
 */
public class Calculator {

	private int total;
	private String history = "0";
	
	
	/**
	 * This is an constructor 
	 */
	public Calculator () {
		
	}
	
	
	/**
	 * This constructor just returns the total number 
	 * this number if the calculations of the operations performed 
	 * @return total 
	 */
	public int getTotal () {
		
		return total;
	}
	
	
	/**
	 * @param value this is the amount that is being added
	 * This method adds value to the current total 
	 * It also helps keep tract of the previous history 
	 */
	public void add (int value) {
			
		total = total + value; 
		history = history + " + " + value;
	}
	
	
	/**
	 * @param value this is the amount that is being subtracted
	 * This method subtracts value to the current total 
	 * It also helps keep tract of the previous history 
	 */
	public void subtract (int value) {
		
		total = total - value; 
		history = history + " - " + value;
		
	}
	
	
	/**
	 * @param value this is the amount that is being multiplied
	 * This method multiplies value to the current total 
	 * It also helps keep tract of the previous history 
	 */
	public void multiply (int value) {
		
		total = total * value;
		history = history + " * " + value;
		
	}
	
	
	/**
	 * @param value this is the amount that is being divided
	 * This method divides value to the current total 
	 * It also helps keep tract of the previous history 
	 */
	public void divide (int value) {
		
		total = total / value;
		history = history + " / " + value;
		
	}
	
	
	/**
	 * This method returns a string of the history of 
	 * operations performed on total 
	 * @return a string of the history of operations 
	 */
	public String getHistory () {
		return history;
	}
}
