package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	static Robot rob[]=new Robot[5];
	static int running;
		public static void main(String[] args) {
        // 2. create an array of 5 robots.
			
		// 3. use a for loop to initialize the robots.
			for (int i = 0; i < rob.length; i++) {
				rob [i] = new Robot();
				rob[i].setSpeed(50);
			}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
			for (int i = 0; i < rob.length; i++) {
				rob[i].setY(500);
				rob[i].setX(i*200+50);
			}
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
			Random ran = new Random();
			int run;
			boolean racing = true;
			while(racing) {
			for (running = 0; running < rob.length; running++) {
				run = ran.nextInt(51);
				for (int i = 0;  i<run; i++) {
					move();	
				}
				
			}
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
			}
        // 7. declare that robot the winner and throw it a party!
			JOptionPane.showMessageDialog(null, "We have a winner!");
        // 8. try different races with different amounts of robots.
			
        // 9. make the robots race around a circular track.
			
		}
		
		public static void move() {
				rob[running].move(1);
				rob[running].turn(1);
			
			
		}

}
