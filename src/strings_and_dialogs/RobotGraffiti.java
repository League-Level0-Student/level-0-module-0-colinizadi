package strings_and_dialogs;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot q = new Robot();
		q.setPenColor(Color.orange);
		q.setSpeed(200);
		q.penDown();
		q.move(100);
		q.turn(90);
		q.move(90);
		q.turn(180);
		q.move(90);
		q.turn(270);
		q.move(100);
		q.turn(270);
		q.move(90);
		q.penUp();
		q.move(50);
		q.penDown();
		q.turn(270);
		q.move(100);
	}
}
