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
	int i = 0;
	int y = 550;
	int y2 = 550;
	int y3 = 550;
	int y4 = 550;
	int y5 = 550;
	Thread t = new Thread(()->{
		Random rand1 = new Random();
		Robot r1 = new Robot();
		robo[0] = r1;
		robo[0].moveTo(100, 550);
		while(robo[0].getY() > 0) {
			robo[0].move(rand1.nextInt(50));
		}
	});
	Thread t2 = new Thread(()->{
		Random rand2 = new Random();
		Robot r2 = new Robot();
		robo[1] = r2;
		robo[1].moveTo(200, 550);
		while(robo[1].getY() > 0) {
			robo[1].move(rand2.nextInt(50));
		}
	});
	Thread t3 = new Thread(()->{
		Random rand3 = new Random();
		Robot r3 = new Robot();
		robo[2] = r3;
		robo[2].moveTo(300, 550);
		while(robo[2].getY() > 0) {
			robo[2].move(rand3.nextInt(50));
		}
	});
	Thread t4 = new Thread(()->{
		Random rand4 = new Random();
		Robot r4 = new Robot();
		robo[3] = r4;
		robo[3].moveTo(400, 550);
		while(robo[3].getY() > 0) {
			robo[3].move(rand4.nextInt(50));
		}
	});
	Thread t5 = new Thread(()->{
		Random rand5 = new Random();
		Robot r5 = new Robot();
		robo[4] = r5;
		robo[4].moveTo(500, 550);
		while(robo[4].getY() > 0) {
			robo[4].move(rand5.nextInt(50));
		}
	});
	t.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
		/*
		 * for (i = 0; i < robo.length; i++) { robo[i] = new Robot();
		 * robo[i].setSpeed(10); robo[i].setX(200); robo[i].setY(y); robo[i].turn(90);
		 * robo[i].move(100 * i); robo[i].turn(-90);
		 * 
		 * }
		 */
		/*
		 * while(y > 0 && y2 > 0 && y3 > 0 && y4 > 0 && y5 > 0) { robo[0].move(moveNum);
		 * robo[1].move(moveNum2); robo[2].move(moveNum3); robo[3].move(moveNum4);
		 * robo[4].move(moveNum5); y-=moveNum; y2-=moveNum2; y3-=moveNum3; y4-=moveNum4;
		 * y5-=moveNum5;
		 * 
		 * }
		 */

	if(y < 0 && y2 > 0 && y3 > 0 && y4 > 0 && y5 > 0 ) {
		JOptionPane.showMessageDialog(null, "Robot #1 Wins!");
		robo[0].setX(300);
		robo[0].setY(300);
		for (int j = 0; j < 1;) {
			robo[0].turn(360);
		}
		
	}
	if(y > 0 && y2 < 0 && y3 > 0 && y4 > 0 && y5 > 0 ) {
		JOptionPane.showMessageDialog(null, "Robot #2 Wins!");
		robo[1].setX(300);
		robo[1].setY(300);
		for (int j = 0; j < 1;) {
			robo[1].turn(360);
		}
		
	}
	if(y > 0 && y2 > 0 && y3 < 0 && y4 > 0 && y5 > 0 ) {
		JOptionPane.showMessageDialog(null, "Robot #3 Wins!");
		robo[2].setX(300);
		robo[2].setY(300);
		for (int j = 0; j < 1;) {
			robo[2].turn(360);
		}
		
	}
	if(y > 0 && y2 > 0 && y3 > 0 && y4 < 0 && y5 > 0 ) {
		JOptionPane.showMessageDialog(null, "Robot #4 Wins!");
		robo[3].setX(300);
		robo[3].setY(300);
		for (int j = 0; j < 1;) {
			robo[3].turn(360);
		}
		
	}
	if(y > 0 && y2 > 0 && y3 > 0 && y4 > 0 && y5 < 0 ) {
		JOptionPane.showMessageDialog(null, "Robot #5 Wins!");
		robo[4].setX(300);
		robo[4].setY(300);
		for (int j = 0; j < 1;) {
			robo[4].turn(360);
		}
		
	}
}
	}

