package _02_unbirthday;

import javax.swing.JOptionPane;

public class UNbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer=JOptionPane.showInputDialog(null, "is your birthday on September 13?");
String hello = "is your birthday on September 13?"; 
if(answer.equals("yes")) {
JOptionPane.showMessageDialog(null,"Happy Birthday! :)");	
}
else {
	JOptionPane.showMessageDialog(null,"Happy UNbirthday");}
}

	}


