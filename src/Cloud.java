import java.awt.Color;

import wheels.users.Ellipse;
import wheels.users.Frame;
import wheels.users.Rectangle;

//Author: Garrett Goldberg
// This file creates the instance for one of two clouds, which includes a multitude of ellipses that can be changed in both location and color.

public class Cloud implements Movable {
	
	private DraggableEllipse fluff;
	private DraggableEllipse fluff2;
	private DraggableEllipse fluff3;
	private DraggableEllipse fluff4;
	private DraggableEllipse fluff5;
	private int x, y;
	
// The section below creates the parameters for one of two clouds in the scene. The code after also uses setters and getters for colors and location.
	
	public Cloud(int x, int y, Color color) {
		
		fluff = new DraggableEllipse(this);
		fluff.setSize(100, 50);
		
		fluff2 = new DraggableEllipse(this);
		fluff2.setSize(100, 50);
		
		fluff3 = new DraggableEllipse(this);
		fluff3.setSize(100, 50);
		
		fluff4 = new DraggableEllipse(this);
		fluff4.setSize(100, 50);
		
		fluff5 = new DraggableEllipse(this);
		fluff5.setSize(100, 50);
		
		setLocation(x, y);
		setColor(color);
	}
	
	// This section returns the color values for the parts of the object. It also includes setters for both location and color. It also implements the "movable" interface.
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		fluff.setLocation(x,y);
		fluff2.setLocation(fluff.getXLocation() + 25, fluff.getYLocation() + 25);
		fluff3.setLocation(fluff.getXLocation() + 50, fluff.getYLocation());
		fluff4.setLocation(fluff.getXLocation() + 100, fluff.getYLocation() + 25);
		fluff5.setLocation(fluff.getXLocation() + 125, fluff.getYLocation());
	}
	
	 public int getX() { return x; }
	 public int getY() { return y; }
	    
	@Override
    public void move(int dx, int dy)
    {
        this.setLocation(this.getX() + dx, this.getY() + dy);
    }
	
	public void setColor(Color color) {
		fluff.setColor(color);
		fluff2.setColor(color);
		fluff3.setColor(color);
		fluff4.setColor(color);
		fluff5.setColor(color);
	}
	
	
	public Color getFluffColor() {
		return fluff.getColor();
	}
	
	public Color getFluff2Color() {
		return fluff2.getColor();
	}
	
	public Color getFluff3Color() {
		return fluff3.getColor();
	}
	
	public Color getFluff4Color() {
		return fluff4.getColor();
	}
	
	public Color getFluff5Color() {
		return fluff5.getColor();
	}
	
	public int getXLocation() {
		return fluff.getXLocation();
	}
	
	public int getYLocation() {
		return fluff.getYLocation();
	}
	
}
