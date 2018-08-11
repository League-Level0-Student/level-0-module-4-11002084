package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {
	static String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
	static int happinessLevel = 0;
	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 10; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Give Food", "Give Water", "Cuddle" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				food();
			}
			else if (task == 1) {
				water();
			}
			else if (task == 2) {
				cuddle();
			}
			System.out.println("Your pet's happiness level is " +happinessLevel+ ". Get to 10 to win!");
			if (happinessLevel >= 10) {
				JOptionPane.showMessageDialog(null, "You really love your pet!");
				break;
			}
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void food() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " ate the food happily.");
		happinessLevel+=1;
	}

	static void water() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " drank the water happily.");
		happinessLevel+=1;
	}

	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " comfortably cuddled with you.");
		happinessLevel+=2;
	}
}
