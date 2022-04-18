import java.awt.Color;

//Author: Garrett Goldberg
//This file creates the ClickableEllipse object, which extends the Colorable interface, that is used to click objects in the scene in order to change color.

import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

public class ClickableEllipse extends Ellipse implements Colorable {
	private Color color;
	private Colorable colorable;

	public ClickableEllipse(Colorable colorable) {
		this.colorable = colorable;
		
		color = new Color(0,100,0);
		setColor(color);
	}
	
	public void mouseClicked(MouseEvent e) {
		if (getColor().equals(color)) {
			colorable.setColor(Color.ORANGE);
		} else if (getColor().equals(Color.ORANGE)) {
			colorable.setColor(new Color(0,100,0));
		}
	}
}	
