import javax.swing.JOptionPane;

public class AWESOME {
public static void main(String[] args) {
	String io = JOptionPane.showInputDialog( "What do you like?");
	JOptionPane.showMessageDialog(null, io + " is awesome");
}
}
