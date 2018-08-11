package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

public class StringMethods1 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to whatever you want
		String computer = ("flareon");
		// 2. Print the 3rd char of your String to the console.
		// HINT: .charAt
		System.out.println(computer.charAt(2));
		// 3. Print the length of your String to the console.
		// HINT: .length()
		System.out.println(computer.length());
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int i = 0; i < 7; i++) {
			System.out.println(computer.charAt(i));
		}
		// 5. Pick a char inside your String, and use a loop to determine
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"
		String index = JOptionPane.showInputDialog("What letter do you want to search for?");
		if (index.equals("f")) {
			for (int i = 0; i < 7; i++) {
				char thing = computer.charAt(i);
				String thing2 = Character.toString(thing);
				if (thing2.equals(index)) {
					JOptionPane.showMessageDialog(null, index + " is at index " + i);
				}
			}
		}
		if (index.equals("l")) {
			for (int i = 0; i < 7; i++) {
				char thing = computer.charAt(i);
				String thing2 = Character.toString(thing);
				if (thing2.equals(index)) {
					JOptionPane.showMessageDialog(null, index + " is at index " + i);
				}
			}
		}
		if (index.equals("a")) {
			for (int i = 0; i < 7; i++) {
				char thing = computer.charAt(i);
				String thing2 = Character.toString(thing);
				if (thing2.equals(index)) {
					JOptionPane.showMessageDialog(null, index + " is at index " + i);
				}
			}
		}
		if (index.equals("r")) {
			for (int i = 0; i < 7; i++) {
				char thing = computer.charAt(i);
				String thing2 = Character.toString(thing);
				if (thing2.equals(index)) {
					JOptionPane.showMessageDialog(null, index + " is at index " + i);
				}
			}
		}
		if (index.equals("e")) {
			for (int i = 0; i < 7; i++) {
				char thing = computer.charAt(i);
				String thing2 = Character.toString(thing);
				if (thing2.equals(index)) {
					JOptionPane.showMessageDialog(null, index + " is at index " + i);
				}
			}
		}
		if (index.equals("o")) {
			for (int i = 0; i < 7; i++) {
				char thing = computer.charAt(i);
				String thing2 = Character.toString(thing);
				if (thing2.equals(index)) {
					JOptionPane.showMessageDialog(null, index + " is at index " + i);
				}
			}
		}
		if (index.equals("n")) {
			for (int i = 0; i < 7; i++) {
				char thing = computer.charAt(i);
				String thing2 = Character.toString(thing);
				if (thing2.equals(index)) {
					JOptionPane.showMessageDialog(null, index + " is at index " + i);
				}
			}
		}

	}
}
