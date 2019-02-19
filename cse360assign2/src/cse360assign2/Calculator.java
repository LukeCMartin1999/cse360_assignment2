package cse360assign2;

/**
 * @author Luke C. Martin
 * This class performs basic arithmetic operations such as,
 * addition, subtraction, multiplication, and division.
 * it takes in a private int variable of total.
 */



public class Calculator {


	private int total;


	/**
	 * This constructor creates the int variable total 
	 */


	public Calculator () {
		total = 0;  // not needed - included for clarity
	}


	/**
	 * This constructor just returns the total number 
	 * this number if the calculations of the operations performed 
	 * @return total 
	 */
	public int getTotal () {
		return 0;
	}


	/**
	 * @param value this is the amount that is being added
	 * This method adds value to the current total 
	 */
	public void add (int value) {


	}


	/**
	 * @param value this is the amount that is being subtracted
	 * This method subtracts value to the current total 
	 */
	public void subtract (int value) {

	}


	/**
	 * @param value this is the amount that is being multiplied
	 * This method multiplies value to the current total 
	 */
	public void multiply (int value) {

	}



	/**
	 * @param value this is the amount that is being divided
	 * This method divides value to the current total 
	 */
	public void divide (int value) {

	}


	/**
	 * This method returns a string of the history of 
	 * operations performed on total 
	 * @return a string of the history of operations 
	 */



	public String getHistory () {
		return "";
	}

}
