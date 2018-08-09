package doubles_and_booleans;

import javax.swing.JOptionPane;

public class Test_Score {
public static void main(String[] args) {
	String score=JOptionPane.showInputDialog("What was your test score?");
	double score2=Double.parseDouble(score);
	if(score2==100) {
		JOptionPane.showMessageDialog(null, "You're absolutely perfect!");
	}
	else if(score2>=90) {
		JOptionPane.showMessageDialog(null, "You must've studied well for the test! You did great!");
	}
	else if(score2>=80) {
		JOptionPane.showMessageDialog(null, "You did pretty well!");
	}
	else if(score2>=70) {
		JOptionPane.showMessageDialog(null, "Umm...you're average at least...");
	}
	else if(score2>=60) {
		JOptionPane.showMessageDialog(null, "You frantically studied right before class, didn't you?");
	}
	else if(score2>=50) {
		JOptionPane.showMessageDialog(null, "Dude...Did you study at all?");
	}
	else if(score2>=40) {
		JOptionPane.showMessageDialog(null, "You're failing the class.");
	}
	else if(score2>=30) {
		JOptionPane.showMessageDialog(null, "You're going to work at Mc.Donalds for the rest of you're life.");
	}
	else if(score2>=20) {
		JOptionPane.showMessageDialog(null, "You're going to be in school until you're 60.");
	}
	else if(score2>=10) {
		JOptionPane.showMessageDialog(null, "The president will come and personally insult your stupidity.");
	}
	else{
		JOptionPane.showMessageDialog(null, "...");
	}

}
}
