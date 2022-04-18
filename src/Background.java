import java.awt.Color;
import wheels.users.Frame;
import wheels.users.Rectangle;

//Author: Garrett Goldberg
// This instance sets up the initial background of the sky, road, and grass.

public class Background {
	private Rectangle road1;
	private Rectangle grass;
	private Rectangle sky;

// This section creates the parameters for the background of the scene. 
	
	public Background(Color color) {
		sky = new Rectangle();
		sky.setLocation(0,0);
		sky.setSize(700,500);
		setColor(color);
		
		road1 = new Rectangle();
		road1.setColor(Color.DARK_GRAY);
		road1.setLocation(0,300);
		road1.setSize(700,100);
		
		grass = new Rectangle();
		grass.setColor(Color.GREEN);
		grass.setLocation(0,400);
		grass.setSize(700,200);
		
	}
	
	public void setColor(Color color) {
		sky.setColor(color);
	}
	
}