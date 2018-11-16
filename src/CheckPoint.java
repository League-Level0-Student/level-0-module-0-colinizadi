import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {

	Robot wtf = new Robot();
	wtf.setSpeed(100);
	wtf.turn(90);
	wtf.penDown();
	wtf.move(100);
	wtf.turn(120);
	wtf.move(100);
	wtf.turn(120);
	wtf.move(100);
}
}
