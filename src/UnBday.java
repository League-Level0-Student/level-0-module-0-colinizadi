import javax.swing.JOptionPane;

public class UnBday {
	public static void main(String[] args) {

		String tigger = JOptionPane.showInputDialog("what is your birthday?");
		if (tigger.equals("10/15/18")) {
			JOptionPane.showMessageDialog(null,
					"HAPPY BIRTHDAY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		} else {
			JOptionPane.showMessageDialog(null, "Happy UnBirthday :/");

		}
	}
}
