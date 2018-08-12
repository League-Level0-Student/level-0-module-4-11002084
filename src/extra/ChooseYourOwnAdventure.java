package extra;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	static int gold = 0;
	static int health = 100;

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"You are a hero on a journey to accumulate enough gold to save your family, which is being held for ransom by King Mitidus.");
		JOptionPane.showMessageDialog(null,
				"Along your journey, you will be given choices that can affect your health and amount of gold.");
		JOptionPane.showMessageDialog(null,
				"You start with 0 gold and 100 health. You need to accumulate 1000 gold to save your family.");
		JOptionPane.showMessageDialog(null,
				"If you die on your journey or don't collect enough gold, your family will be executed.");
		JOptionPane.showMessageDialog(null, "Your journey starts now.");
		JOptionPane.showMessageDialog(null, "This is where a 10 hour loading screen would go. But, there isn't one.");
		JOptionPane.showMessageDialog(null, "You leave your home and head into the forest.");
		int choice1 = JOptionPane.showConfirmDialog(null,
				"You arrive at a clearing and see a dead body. The dead body has a pouch in its hand. You could search through the pouch...but if there's a dead body here, what's the chance you'll be the next one? What if its a trap? Do you search the pouch?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice1 == 0) {
			JOptionPane.showMessageDialog(null,
					"You search the pouch despite your better judgement. You find 100 gold in the pouch. You leave the area without being attacked, to your inner sense's surprise.");
			gold += 100;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
		} else {
			JOptionPane.showMessageDialog(null,
					"You decide it's a trap, and leave the body alone. You leave the area before you are attacked.");
			death();
		}
		JOptionPane.showMessageDialog(null, "You keep walking through the forest.");
		int choice2 = JOptionPane.showConfirmDialog(null,
				"You see a mossy box in the forest. You could pry it open with your sword...but you might cut yourself. Do you pry open the box?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice2 == 0) {
			JOptionPane.showMessageDialog(null,"You managed to pry the box open with your sword, and you managed to find 200 gold among all the other trash in the box. You, however, also managed to cut yourself with your sword while prying open the box, causing you to suffer 20 damage.");
			gold += 200;
			health -= 20;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
			JOptionPane.showMessageDialog(null, "You now have " + health + " health.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You decide it's better not to pry open the box. You don't feel like breaking your sword in half.");
			death();
		}
		JOptionPane.showMessageDialog(null, "You walk out of the forest and into a little town.");
		int choice3 = JOptionPane.showConfirmDialog(null,
				"You see a wealthy looking man. He must be carrying a lot of gold on him... You can rob him...but he's also flanked by two sword-wielding guards, and is robbing someone even ethical?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice3 == 0) {
			JOptionPane.showMessageDialog(null,"You take a running start and ram into the man. You punch him square in the jaw and knock him out. You then get up and start sword-fighting with the man's guards. After a long fight, you finally manage to take out the two guards, but you suffer 60 damage. Afterwards, you search the wealthy man's body, but only manage to find 5 gold in his pockets. ");
			gold += 5;
			health -= 60;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
			JOptionPane.showMessageDialog(null, "You now have " + health + " health.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You leave the man alone. You don't feel like dying in a sword fight today.");
			death();
		}
		JOptionPane.showMessageDialog(null, "You continue wandering the streets of the town.");
		int choice4 = JOptionPane.showConfirmDialog(null,
				"You see a small bakery up the street. It's not guarded, and looks to be an establishment that makes a fair amount of money. You could rob it...do you want to?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice4 == 0) {
			JOptionPane.showMessageDialog(null,"You barge into the bakery, sword in hand. You demand money from the shopkeeper. But, he reaches under the counter and pulls out an arquebus, where did he get that thing!? He pulls the trigger, headshot.");
			gold += 0;
			health -= 100;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
			JOptionPane.showMessageDialog(null, "You now have " + health + " health.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You aren't going to risk it. You don't want to get caught by knights on patrol.");
			death();
		}
		JOptionPane.showMessageDialog(null, "You walk out of the town and onto a grassland.");
		int choice5 = JOptionPane.showConfirmDialog(null,
				"You see a merchant riding a horse that's pulling a cart full of goods. You could rob him...do you want to?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice5 == 0) {
			JOptionPane.showMessageDialog(null,"You run up to the horse and push the merchant off. This scares the horse, causing it to run off with the merchant's cart of goods. You run to the fallen merchant and punch him in the jaw, knocking him out. You find 3 pouches of gold on the merchant, a total of 300 gold.");
			gold += 300;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You leave the merchant alone. he looks like one of King Mitidus's merchants, and you don't want to anger the king.");
			death();
		}
		JOptionPane.showMessageDialog(null, "You continue wandering the grassland.");
		int choice6 = JOptionPane.showConfirmDialog(null,
				"You spot an abandoned cart. You could search through it and see if you can find any gold. But, there's also a chance someone still owns the cart... Do you want to search the cart?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice6 == 0) {
			JOptionPane.showMessageDialog(null,"You climb into the cart and start searching through boxes and barrels. You end up finding 200 gold. But, as you step outside, someone throws a rock at you. It hits you in the chest, causing you to suffer 20 damage. The thrower, an old man, yells for you to stay away from his cart. You leave the area.");
			gold += 200;
			health -= 20;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
			JOptionPane.showMessageDialog(null, "You now have " + health + " health.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You leave the cart alone. you doubt you'll find anything in there anyway.");
			death();
		}
		JOptionPane.showMessageDialog(null, "You continue through the grassland.");
		int choice7 = JOptionPane.showConfirmDialog(null,
				"You see a small hut. You could rob it...but the owner might come back and give you a beating. Do you want to rob the hut?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice7 == 0) {
			JOptionPane.showMessageDialog(null,"You kick down the hut's door and start ransacking the entire place. After you've thoroghly searched through the entire hut, you've found a total of 300 gold. You then quietly sneak out of the house and leave, all before the hut's owner comes back. However, during your rushed ransacking, you did scrape your arms on a rusty nail or two, cauing you to suffer 30 damage.");
			gold += 300;
			health-=30;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
			JOptionPane.showMessageDialog(null, "You now have "+health+ " health");
		}
		else {
			JOptionPane.showMessageDialog(null, "You leave the hut behind. You don't want to rob some innocent person homw and leave them with nothing.");
			death();
		}
		JOptionPane.showMessageDialog(null, "You reach a mountain range and start trekking through.");
		int choice8 = JOptionPane.showConfirmDialog(null,
				"You see a large bag of gold just lying on the ground. How did it get here? You could just take it...but it also looks very suspisious.",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice8 == 0) {
			JOptionPane.showMessageDialog(null,"You walk up to the bag and grab it. There's 500 gold in there! Suddenly, you're jumped by a group of bandits. It was a trap! You fight off the bandits, but suffer 80 damage.");
			gold += 500;
			health -= 80;
			death();
			JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
			JOptionPane.showMessageDialog(null, "You now have " + health + " health.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You leave the bag alone. It looks like a trap.");
			death();
			JOptionPane.showMessageDialog(null, "You continue trekking through the mountains.");
			int choice9 = JOptionPane.showConfirmDialog(null,
					"You find a treasure map on the ground, do you follow it?",
					"A Choice", JOptionPane.YES_NO_OPTION);
			if (choice9 == 0) {
				JOptionPane.showMessageDialog(null,"You follow the directions on the map for about an hour, and finally reach a cave enterance. You go in the cave and find an old box. You pry the box open, revealing 300 gold.");
				gold += 300;
				death();
				JOptionPane.showMessageDialog(null, "You now have " + gold + " gold.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You ignore the map. If it's just lying here, it probably means someone else died trying to find the probably non-existant treasure.");
				death();
			}
		}
		JOptionPane.showMessageDialog(null, "You reach the other side of the mountain range and come face to face with a beautiful ocean..");
		int choice10 = JOptionPane.showConfirmDialog(null,
				"You see a barrel on the shore. There's probably nothing in it, but it doesn't hurt to look, right? Do you want to search the barrel?",
				"A Choice", JOptionPane.YES_NO_OPTION);
		if (choice10 == 0) {
			JOptionPane.showMessageDialog(null,"You search the barrel. Yep, there's nothing in it.");
			death();
		}
		else {
			JOptionPane.showMessageDialog(null, "You don't want to waste your time.");
			death();
		}
		JOptionPane.showMessageDialog(null, "Your journey has now reached its end. You must now fo to King Mitidus's castle and turn over your gold and free your family.");
		if (gold>=1000) {
			JOptionPane.showMessageDialog(null, "You reach the castle and the guards let you in. You come face to face with the king himself. But instead of turning over your gold,");
			JOptionPane.showMessageDialog(null, "you slash him with your sword, ending his life. You then free your family and escape the castle.");
			JOptionPane.showMessageDialog(null, "Congratulations! You saved your family! You Win!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You reach the castle, but the guards discover that you don't have enough gold. They kill you on the spot. Your family is executed.");
			JOptionPane.showMessageDialog(null, "Despite your best efforts, you still failed to save your family in the end. You Lose!");
		}
	}

	static void death() {
		if (health <= 0) {
			JOptionPane.showMessageDialog(null, "You died! You failed your mission. Your family was executed.");
			System.exit(0);
		}
	}
}
