//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import java.net.URI;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			
		
		// 1. Ask the user for a guess using a pop-up window, and save their response 
String Guess;
Guess =		JOptionPane.showInputDialog("Take a guess, 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
for (int i = 0; i < 10 ; i++) {
int Guess1 =	Integer.parseInt(Guess);
		
			// 5. if the guess is correct
if (Guess1 == (random)) {
	JOptionPane.showMessageDialog(null, "You Win!!");
System.exit(0);
}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
else if (Guess1 > (random)) {
Guess=	JOptionPane.showInputDialog("Too High, try again");
}

				// 8. Tell them it's too high
			// 9. if the guess is low
if (Guess1 < (random)) {
	Guess=	JOptionPane.showInputDialog("Too Low, try aqain");
	}
				// 10. Tell them it's too low
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose");
	}
}



