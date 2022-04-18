import java.awt.Color;

import wheels.users.Ellipse;
import wheels.users.Frame;
import wheels.users.Line;
import wheels.users.Rectangle;
import wheels.users.RoundedRectangle;

//Author: Garrett Goldberg
// This file creates the instance of the car or vehicle in the scene, which can be adjusted in both position and color. 

public class Car {
	
	private Rectangle frame1;
	private ClickableRectangle frame2;
	private Rectangle window;
	private Ellipse tire1;
	private Ellipse tire2;
	private RoundedRectangle light;
	
// This section creates the parameters for this class that creates a vehicle in the frame. The code after also uses setters and getters for colors and location.
	public Car(int x, int y, int w, int h, Color color) {
		
		frame1 = new Rectangle();
		frame1.setSize(150,50);
		
		frame2 = new ClickableRectangle(this);
		
		window = new Rectangle();
		window.setColor(Color.BLUE);
		window.setSize(30,30);
		
		light = new RoundedRectangle();
		light.setColor(Color.YELLOW);
		light.setSize(20,20);
		
		tire1 = new Ellipse();
		tire1.setColor(Color.BLACK);
		tire1.setSize(40,40);
		
		tire2 = new Ellipse();
		tire2.setColor(Color.BLACK);
		tire2.setSize(40,40);
		
		setLocation(x, y);
		setSize(w, h);
		setColor(color);
	}
	
	// This section returns the color values for the parts of the object. It also includes setters for both location and color.
	
	public void setLocation(int x, int y) {
		frame1.setLocation(x,y);
		frame2.setLocation(frame1.getXLocation() + 30, frame1.getYLocation() - 40);
		window.setLocation(frame1.getXLocation() + 80, frame1.getYLocation() - 30);
		light.setLocation(frame1.getXLocation() + 130, frame1.getYLocation() + 10);
		tire1.setLocation(frame1.getXLocation() + 10, frame1.getYLocation() + 35);
		tire2.setLocation(frame1.getXLocation() + 100, frame1.getYLocation() + 35);;
	}
	
	
	public void setColor(Color color) {
		frame1.setColor(color);
		frame2.setColor(color);
	}
	
	public Color getFrame1Color() {
		return frame1.getColor();
	}
	
	public void setSize(int w, int h) {
		frame1.setSize(w, h);;
	}
	
	public Color getFrame2Color() {
		return frame2.getColor();
	}
	
	public Color getWindowColor() {
		return window.getColor();
	}
	
	public Color getLightColor() {
		return light.getColor();
	}
	
	public Color getTire1Color() {
		return tire1.getColor();
	}
	
	public Color getTire2Color() {
		return tire2.getColor();
	}
}
