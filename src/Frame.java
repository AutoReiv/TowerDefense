import java.awt.Dimension;

import javax.swing.*;

public class Frame extends JFrame {
	public static String title = "TowerDefense Alpha";
	public static Dimension size = new Dimension(550, 650);
	
	public Frame(){
		setTitle(title);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void init(){
		
	}
	
	public static void main(String args[]){
		Frame frame = new Frame();
	}
	
}
