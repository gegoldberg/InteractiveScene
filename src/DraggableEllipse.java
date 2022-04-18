import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

//Author: Garrett Goldberg
//This file creates the DraggibleEllipse object, which extends the Movable interface, that is used to drag objects in the scene.

public class DraggableEllipse extends Ellipse implements Movable {
	
	private int xPrev, yPrev;
	private Movable movable;
	
	public DraggableEllipse(Movable movable) {
		this.movable = movable;
		
	}
	
	public void mousePressed(MouseEvent e) {
		xPrev = e.getX();
		yPrev = e.getY();
	}
	
	public void mouseDragged(MouseEvent e) {
		int dx = e.getX() - xPrev;
		int dy = e.getY() - yPrev;
		
		movable.move(dx,dy);
		
		xPrev = e.getX();
		yPrev = e.getY();
		
	}
	
	 @Override
	    public void move(int dx, int dy) // Formal Parameter
	    {
	        this.setLocation(
	                this.getXLocation() + dx,
	                this.getYLocation() + dy);
	    }
	
}
