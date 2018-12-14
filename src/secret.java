import javax.swing.JOptionPane;

public class secret {
	public static void main(String[] args) {
		String password = ":D :] D: D; :. :/";
		String rbx = JOptionPane.showInputDialog("tell me a secret message");
		String smh = JOptionPane.showInputDialog("you can only see the secret message if you can guess the password");
		if (smh.equals(":D :] D: D; :. :/")) {
			JOptionPane.showMessageDialog(null, rbx);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!!!!!!!!!!!!");
		}
	}
}