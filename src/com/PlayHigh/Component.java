package com.PlayHigh;
/**
 * A generic design element
 * 
 *@author Rushil Agrawal, Soumyadeep Ghosh
 */
public class Component {
	
	private int x, y;
	
	public Component(){		
	}
	
	/**
	 * Initializes a new component with specified location
	 */
	public Component (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}