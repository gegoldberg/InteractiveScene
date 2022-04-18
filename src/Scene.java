import java.awt.Color;

// Author: Garrett Goldberg
// This file displays the scene, in which it displays all instances created for the frame.

import wheels.users.Frame;

public class Scene extends Frame {
	private Background background;
	private House house;
	private Car car;
	private Cloud cloud1;
	private Cloud cloud2;
	private Sun sun;
	private Tree tree;
	private Tree tree2;
	private Tree tree3;
	
// This section inputs all of the instances created and places them onto a single GUI via the parameters such as color and location.
	
	public Scene() {
		background = new Background(Color.CYAN);
		house = new House(75,200, Color.RED);
		car = new Car(300,280, 150, 50, Color.RED);
		cloud1 = new Cloud(200, 20, Color.WHITE);
		cloud2 = new Cloud(450, 20, Color.WHITE);
		sun = new Sun(0,0, Color.YELLOW, Color.ORANGE, background);
		tree = new Tree(500,200, 50, 75, new Color(0,100,0));
		tree2 = new Tree(575,200, 50, 75, new Color(0,100,0));
		tree3 = new Tree(650,200, 50, 75, new Color(0,100,0));
	}

// This section builds a new scene in the Wheels GUI.
	
	public static void main(String[] args) {
		new Scene();
	}
	
}
