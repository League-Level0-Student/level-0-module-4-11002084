package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels=JOptionPane.showInputDialog("How many nickels do you have, mate?");

		// Convert their answer to an int using Integer.parseInt()
		int nickels2=Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
		String dimes=JOptionPane.showInputDialog("How many dimes do you have, mate?");
		int dimes2=Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
		String quarters=JOptionPane.showInputDialog("How many quarters do you have, mate?");
		int quarters2=Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
		int nickels3=(nickels2 * 5);
		int dimes3=(dimes2 * 10);
		int quarters3=(quarters2 * 25);
		double money=(nickels3 + dimes3 + quarters3);
		// Tell the user how much money they have
		System.out.println("You have " +money+ " cents.");
	}
}

