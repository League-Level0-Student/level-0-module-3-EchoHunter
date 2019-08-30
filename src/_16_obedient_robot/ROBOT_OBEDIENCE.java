package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ROBOT_OBEDIENCE {
	static Robot RoboFred;
	public static void main(String[] args) {
		 RoboFred= new Robot();
	RoboFred.setPenColor(232,19,19);
	RoboFred.setSpeed(9999);
drawStar();
}

		
	
static void drawSquare(){
	RoboFred.move(-50);
	RoboFred.penDown();
	RoboFred.turn(-90);
	RoboFred.move(50);
	for (int i = 0; i <3; i++) {
		RoboFred.turn(90);
		RoboFred.move(100);
		}
	RoboFred.turn(90);
	RoboFred.move(50);
}
	static void drawTriangle() {
		RoboFred.move(-50);
		RoboFred.penDown();
		RoboFred.turn(-90);
		RoboFred.move(50);
		for (int Q = 0; Q < 2; Q++) {
			RoboFred.turn(120);
			RoboFred.move(200);
			
		}
		RoboFred.turn(90);
		RoboFred.move(50);
	}
static void drawCircle() {
	RoboFred.turn(-90);
	RoboFred.move(50);
	RoboFred.turn(90);
	RoboFred.penDown();
	for (int G = 0; G < 360; G++) {
		RoboFred.move(10);
		RoboFred.turn(1);
	}
}
static void drawStar() {
	RoboFred.turn(-90);
	RoboFred.move(100);
	RoboFred.turn(90);
	RoboFred.penDown();
	for (int A = 0; A < 5; A++) {
		
		RoboFred.move(400);
		RoboFred.turn(144);
	}
}
}
