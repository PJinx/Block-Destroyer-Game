package Main;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		
		Game game = new Game();
		
		obj.setBounds(10, 10, 600, 700);
		obj.setTitle("Wreck-It Ralphie Game");
		obj.setResizable(true);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
		obj.setVisible(true);
		
	}

}
