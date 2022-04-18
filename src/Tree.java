import java.awt.Color;

import wheels.users.Ellipse;
import wheels.users.Rectangle;

//Author: Garrett Goldberg
// This file creates the instance of one of three trees. The file also allows for the user to set the colors of the leaves.

public class Tree implements Colorable {
	
	private Rectangle trunk;
	private ClickableEllipse leaf1;
	private ClickableEllipse leaf2;
	private ClickableEllipse leaf3;
	
// The code below is the parameters for one of three trees that are in the scene. The code after also uses setters and getters for colors and location.
	
	public Tree(int x, int y, int w, int h, Color color) {

		trunk = new Rectangle();
		trunk.setColor(new Color(150, 75, 0));
		trunk.setFrameColor(Color.BLACK);
		trunk.setSize(20,100);
		
		leaf1 = new ClickableEllipse(this);
		
		leaf2 = new ClickableEllipse(this);
		
		leaf3 = new ClickableEllipse(this);
		
		setSize(w, h);
		setLocation(x, y);
		setColor(color);
	}
	
	// This section returns the color values for the parts of the object. It also includes setters for both location and color.
	
	public void setLocation(int x, int y) {
		trunk.setLocation(x,y);
		leaf1.setLocation(trunk.getXLocation() - 25, trunk.getYLocation() - 25);
		leaf2.setLocation(trunk.getXLocation(), trunk.getYLocation() - 25);
		leaf3.setLocation(trunk.getXLocation() - 15, trunk.getYLocation() - 50);
	}
	
	public void setColor(Color color) {
		leaf1.setColor(color);
		leaf2.setColor(color);
		leaf3.setColor(color);
	}
	
	public void setSize(int w, int h) {
		leaf1.setSize(w, h);;
		leaf2.setSize(w, h);
		leaf3.setSize(w, h);
	}
	
	
		public Color getTrunkColor() {
			return trunk.getColor();
		}
		
		public Color getLeaf1Color() {
			return leaf1.getColor();
		}
		
		public Color getLeaf2Color() {
			return leaf2.getColor();
		}
		
		public Color getLeaf3Color() {
			return leaf3.getColor();
		}
}
