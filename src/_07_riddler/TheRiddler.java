package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
	
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
JOptionPane.showInputDialog("David's father has three sons : Snap, Crackle and _____ ?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
JOptionPane.showMessageDialog(null, "the answer is David: David's FATHER has 3 sons, Snap, Crackle, and David");
JOptionPane.showMessageDialog(null, "If you got that right give yourself 1 point!");
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
JOptionPane.showInputDialog("Can you name three consecutive "
		+ "days without using the words Monday, Tuesday, Wednesday, "
		+ "Thursday, Friday, Saturday, or Sunday?");
JOptionPane.showMessageDialog(null,"the answer is yesterday, today, and tomorrow!");
JOptionPane.showMessageDialog(null,"If you got that right give yourself a point");
		// 2. Make a pop up to show the score.
JOptionPane.showInputDialog("what is your score?"+"  out of 2");
JOptionPane.showMessageDialog(null,"good job!");
	}
}

