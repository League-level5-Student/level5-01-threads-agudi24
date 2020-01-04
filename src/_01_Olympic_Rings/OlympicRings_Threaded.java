package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
	Robot r1 = new Robot(400 - 50, 300);
	Robot r2 = new Robot(800 - 50, 300);
	Robot r3 = new Robot(1200 - 50, 300);
	Robot r4 = new Robot(600 - 50, 500);
	Robot r5 = new Robot(1000 - 50, 500);
	int speed = 5000;
	int ringRadius = 3;
	int p = 35;
	r1.setSpeed(20);
	r2.setSpeed(20);
	r3.setSpeed(20);
	r4.setSpeed(20);
	r5.setSpeed(20);
	r1.setPenColor(Color.decode("#0085C7"));
	r2.setPenColor(Color.decode("#000000"));
	r3.setPenColor(Color.decode("#DF0024"));
	r4.setPenColor(Color.decode("#F4C300"));
	r5.setPenColor(Color.decode("#009F3D"));
	r1.penDown();
	r2.penDown();
	r3.penDown();
	r4.penDown();
	r5.penDown();
	r1.setPenWidth(p);
	r2.setPenWidth(p);
	r3.setPenWidth(p);
	r4.setPenWidth(p);
	r5.setPenWidth(p);
	for (int i = 1; i < 361; i++) {
		r1.move(ringRadius);
		r2.move(ringRadius);
		r3.move(ringRadius);
		r4.move(ringRadius);
		r5.move(ringRadius);
		r1.turn(1);
		r2.turn(1);
		r3.turn(1);
		r4.turn(1);
		r5.turn(1);
	}
	r1.penUp();
	r2.penUp();
	r3.penUp();
	r4.penUp();
	r5.penUp();
	Thread robo1 = new Thread(()->r1.moveTo(10, 10));
	Thread robo2 = new Thread(()->r2.moveTo(10, 10));
	Thread robo3 = new Thread(()->r3.moveTo(10, 10));
	Thread robo4 = new Thread(()->r4.moveTo(10, 10));
	Thread robo5 = new Thread(()->r5.moveTo(10, 10));
	robo1.start();
	robo2.start();
	robo3.start();
	robo4.start();
	robo5.start();
	}

}

