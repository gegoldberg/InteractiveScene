import java.awt.Color;

import wheels.users.Ellipse;
import wheels.users.Frame;
import wheels.users.Rectangle;

// Author: Garrett Goldberg
// This file creates the instance for the lower part of the house, which includes the windows, door, and walls of the house. 

public class House {

	private Rectangle frame;
	private HouseRoof houseRoof;
	private Rectangle door;
	private Rectangle window1;
	private Rectangle window2;
	private Ellipse knob;

// The section below is part of a component class of two parts of the house within the scene.
// The following code includes parameters for the lower portion of the house. The code after also uses setters and getters for colors and location.
	
	public House(int x, int y, Color color) {
		
		frame = new Rectangle();
		frame.setSize(125,100);
		
		houseRoof = new HouseRoof(50,175, Color.BLACK);
		
		door = new Rectangle();
		door.setColor(Color.BLACK);
		door.setSize(25,40);
		
		window1 = new Rectangle();
		window1.setColor(Color.BLUE);
		window1.setSize(30,30);
		
		window2 = new Rectangle();
		window2.setColor(Color.BLUE);
		window2.setSize(30,30);
		
		knob = new Ellipse();
		knob.setColor(Color.YELLOW);
		knob.setSize(5,5);
		
		setLocation(x,y);
		setColor(color);
	}
	
	public void setLocation(int x, int y) {
		frame.setLocation(x,y);
		door.setLocation(frame.getXLocation() + 50, frame.getYLocation() + 60);
		window1.setLocation(frame.getXLocation() + 15, frame.getYLocation() + 20);
		window2.setLocation(frame.getXLocation() + 80, frame.getYLocation() + 20);
		knob.setLocation(frame.getXLocation() + 65, frame.getYLocation() + 80);
	}
	
	public void setColor(Color color) {
		frame.setColor(color);
	}
	
	// This section returns the color values for the parts of the object.
	
		public Color getframeColor() {
			return frame.getColor();
		}
		
		public Color getDoorColor() {
			return door.getColor();
		}
		
		public Color getWindow1Color() {
			return window1.getColor();
		}
		
		public Color getWindow2Color() {
			return window2.getColor();
		}
		
		public Color getKnobColor() {
			return knob.getColor();
		}
}
