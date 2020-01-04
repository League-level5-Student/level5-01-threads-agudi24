package _02_Advanced_Robot_Race;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) throws AWTException {
		
	Robot[] robo = new Robot[5];
	Random rand1 = new Random();
	Random rand2 = new Random();
	Random rand3 = new Random();
	Random rand4 = new Random();
	Random rand5 = new Random();
	Robot r1 = new Robot();
	Robot r2 = new Robot();
	Robot r3 = new Robot();
	Robot r4 = new Robot();
	Robot r5 = new Robot();
	r1.setSpeed(20);
	r2.setSpeed(20);
	r3.setSpeed(20);
	r4.setSpeed(20);
	r5.setSpeed(20);
	Thread t = new Thread(()->{
		robo[0] = r1;
		robo[0].moveTo(100, 550);
		robo[1] = r2;
		robo[1].moveTo(200, 550);
		robo[2] = r3;
		robo[2].moveTo(300, 550);
		robo[3] = r4;
		robo[3].moveTo(400, 550);
		robo[4] = r5;
		robo[4].moveTo(500, 550);
	
	});
	t.start();
	
	while(r1.getY() > 0 && r2.getY() > 0 && r3.getY() > 0 && r4.getY() > 0 && r5.getY() > 0) {
		r1.move(rand1.nextInt(50));
		r2.move(rand2.nextInt(50));
		r3.move(rand3.nextInt(50));
		r4.move(rand4.nextInt(50));
		r5.move(rand5.nextInt(50));
	}

	if(r1.getY() < 0 && r2.getY() > 0 && r3.getY() > 0 && r4.getY() > 0 && r5.getY() > 0) {
		JOptionPane.showMessageDialog(null, "Robot #1 Wins!");
		r1.setX(300);
		r1.setY(300);
		for (int j = 0; j < 1;) {
			r1.turn(360);
		}
		
	}
	if(r1.getY() > 0 && r2.getY() < 0 && r3.getY() > 0 && r4.getY() > 0 && r5.getY() > 0) {
		JOptionPane.showMessageDialog(null, "Robot #2 Wins!");
		r2.setX(300);
		r2.setY(300);
		for (int j = 0; j < 1;) {
			r2.turn(360);
		}
		
	}
	if(r1.getY() > 0 && r2.getY() > 0 && r3.getY() < 0 && r4.getY() > 0 && r5.getY() > 0) {
		JOptionPane.showMessageDialog(null, "Robot #3 Wins!");
		r3.setX(300);
		r3.setY(300);
		for (int j = 0; j < 1;) {
			r3.turn(360);
		}
		
	}
	if(r1.getY() > 0 && r2.getY() > 0 && r3.getY() > 0 && r4.getY() < 0 && r5.getY() > 0) {
		JOptionPane.showMessageDialog(null, "Robot #4 Wins!");
		r4.setX(300);
		r4.setY(300);
		for (int j = 0; j < 1;) {
			r4.turn(360);
		}
		
	}
	if(r1.getY() > 0 && r2.getY() > 0 && r3.getY() > 0 && r4.getY() > 0 && r5.getY() < 0) {
		JOptionPane.showMessageDialog(null, "Robot #5 Wins!");
		r5.setX(300);
		r5.setY(300);
		for (int j = 0; j < 1;) {
			r5.turn(360);
		}
		
	}
}
	}

