import java.awt.Color;

import wheels.users.Rectangle;

//Author: Garrett Goldberg
// This file creates the instance for the roof of the house, which is the upper half of the house.

public class HouseRoof {
	private Rectangle roof1;
	private Rectangle roof2;
	private Rectangle roof3;
	
// The section below is the second part of the component class for the house that is in the scene.
// The code includes the parameters for the roof of the house. The code after also uses setters and getters for colors and location.
	
	public HouseRoof(int x, int y, Color color) {
		
		roof1 = new Rectangle();
		roof1.setSize(175,25);
	
		roof2 = new Rectangle();
		roof2.setSize(125,25);
		
		roof3 = new Rectangle();
		roof3.setSize(75,25);
		
		setLocation(x, y);
		setColor(color);
	}
	
	public void setLocation(int x, int y) {
		roof1.setLocation(x, y);
		roof2.setLocation(roof1.getXLocation() + 25, roof1.getYLocation() - 25);
		roof3.setLocation(roof1.getXLocation() + 50, roof1.getYLocation() - 50);
		
	}
	
	public void setColor(Color color) {
		roof1.setColor(color);
		roof2.setColor(color);
		roof3.setColor(color);
	}
	
	// This section returns the color values for the parts of the object.
	
	public Color getRoof1Color() {
		return roof1.getColor();
	}
	
	public Color getRoof2Color() {
		return roof2.getColor();
	}
	
	public Color getRoof3Color() {
		return roof3.getColor();
	}
}
