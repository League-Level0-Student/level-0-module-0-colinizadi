package strings_and_dialogs;

import javax.swing.JOptionPane;

public class riddler {
	public static void main(String[] args) {
		int score = 0;
		String lol = JOptionPane
				.showInputDialog("what has hands but cant wave. SPELL IN LOWERCASE!!!!!!!!!!!!!!!!!!!!!!!!!!");
		if (lol.equals("a clock")) {
			JOptionPane.showMessageDialog(null, "you rock!");
			score += 2;
		} else { JOptionPane.showMessageDialog(null, "try again");
		}
	}
}