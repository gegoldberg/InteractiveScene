import java.awt.Color;

import wheels.users.Ellipse;
import wheels.users.Frame;

//Author: Garrett Goldberg
// This file creates the instance for the sun in the upper left of the frame, which can be adjusted in both location and specific color. 

public class Sun implements Movable {
	
	private Ellipse sun1, sun2;
	private Background background;
	private int x, y;
	
// This section of the code includes the parameters for the sun that is in the scene. The code after also uses setters and getters for colors and location.
	
	public Sun(int x, int y, Color innerColor, Color outerColor, Background background) {
		sun1 = new DraggableEllipse(this);
		sun1.setSize(110,110);
		
		sun2 = new DraggableEllipse(this);
		sun2.setSize(100,100);
		
		setLocation(x,y);
		setColor(innerColor, outerColor);
		this.background = background;
	}
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		sun1.setLocation(x,y);
		sun2.setLocation(sun1.getXLocation(), sun1.getYLocation());
	}
	
	public void setColor(Color innerColor, Color outerColor) {
		sun2.setColor(innerColor);
		sun1.setColor(outerColor);
		
	}
	
	 public int getX() { return x; }
	 public int getY() { return y; }
	    
	@Override
    public void move(int dx, int dy)
    {
        this.setLocation(this.getX() + dx, this.getY() + dy);
        background.setColor(Color.PINK);
    }
}
