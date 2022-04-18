import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Rectangle;

//Author: Garrett Goldberg
//This file creates the ClickableEllipse object that is used to click objects in the scene in order for them to change color.

public class ClickableRectangle extends Rectangle {
	private Car car;
	private int Click;

	public ClickableRectangle(Car car) {
		this.car = car;
		setSize(80,40);
		
		Click = 1;
	}
	
	public void mouseClicked(MouseEvent e) {
		if (Click == 1) {
			Click = Click + 1;
			setSize(110,50);
			setLocation(300,240);
		} else if (Click == 2) {
			Click = Click - 1;
			setSize(80,40);
			setLocation(330, 240);
		}
	}
}

