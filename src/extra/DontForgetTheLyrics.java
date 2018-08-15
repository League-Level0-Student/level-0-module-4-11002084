package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	static int number=0;
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "Okay I'm going to play a clip of a song and you have to finish the line of the song.");
		// 5. Use the playSound method to play your song.
		playSound("Tacos.wav");
		// 6. Make a pop-up for the player to type their answer.
		String answer=JOptionPane.showInputDialog("Finish the line. (If you couldn't hear what I was saying because my singing is horrible, I sang: It's raining tacos,...(finish this line)");
		// 7. If they answered correctly, tell them that they were right.
		if(answer.equals("from out of the sky")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			number++;
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else {
			JOptionPane.showMessageDialog(null,"Incorrect. The answer is 'from out of the sky'");
		}
		// 9. Record another sound and repeat steps 5-8.
		JOptionPane.showMessageDialog(null, "Okay next one.");
		playSound("Tacos2.wav");
		String answer2=JOptionPane.showInputDialog("Finish the line. (If you couldn't hear what I was saying because my singing is horrible, I sang: Tacos, no need to...(finish this line)");
		if(answer2.equals("ask why")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			number++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect. The answer is 'ask why'");
		}
		String number2=Integer.toString(number);
		JOptionPane.showMessageDialog(null, "Your score is "+number2 );
		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


