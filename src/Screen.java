import java.awt.*;
import javax.swing.*;

public class Screen extends JPanel implements Runnable {
	public Thread thread = new Thread(this);
	
	public static boolean isFirst = true;
	
	public Screen(){
		thread.start();
	}
	
	public void paintComponent(Graphics g){
		
		
		g.clearRect(0, 0, getWidth(), getHeight());
	}
	
	public static int fpsFrame = 0, fps = 1000000;
	public void run(){
		while(true){
			
			
			repaint();
			
			try{
				Thread.sleep(1);
			} catch (Exception e) {}
		}
	}
}
