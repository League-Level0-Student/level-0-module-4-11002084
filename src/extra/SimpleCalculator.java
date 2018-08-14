package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
		String numberA = JOptionPane.showInputDialog("Give me an integer.");
		String numberB = JOptionPane.showInputDialog("Give me a second integer.");
		int number1 = Integer.parseInt(numberA);
	    int number2 = Integer.parseInt(numberB);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What operation do you want to perform on these numbers?",
				"Calculator", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "/" }, null);
		if(operation==0) {
			add(number1, number2);
		}
		else if(operation==1) {
			subtract(number1, number2);
		}
		else if(operation==2) {
			multiply(number1, number2);
		}
		else {
			JOptionPane.showMessageDialog(null, "Please note that this answer is rounded down to the nearest integer.");
			divide(number1,number2);
		}
		}
	}

	static void add(int a, int b) {
		JOptionPane.showMessageDialog(null, a+ " + " +b+" = " +(a+b));
	}
	static void subtract(int a, int b) {
		JOptionPane.showMessageDialog(null, a+ " - " +b+" = " +(a-b));
	}
	static void multiply(int a, int b) {
		JOptionPane.showMessageDialog(null, a+ " * " +b+" = " +(a*b));
	}
	static void divide(int a, int b) {
		JOptionPane.showMessageDialog(null, a+ " / " +b+" = " +(a/b));
	}
}

// 5. Call the methods created in steps 3 and 4 to perform the appropriate
// operation.

// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

// 3. Create method for addition operation.
// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
// 70.
// HINT: use 'static void add(int num1, num2) { ... }
// 4. Create similar methods for subtraction, multiplication and division.
