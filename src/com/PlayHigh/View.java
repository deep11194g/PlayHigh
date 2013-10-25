package com.PlayHigh;

import java.util.Vector;

/**
 * Modular unit holding components
 * 
 * Write modularity contract
 * 
 * *@author Rushil Agrawal, Soumyadeep Ghosh
 */
public class View extends Vector<Component> {

	private int height, width, difficulty;

	public View() {
		super(1, 1);
	}

	public void setDifficulty(int x) {
		difficulty = x;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setHeight(int x) {
		height = x;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int x) {
		width = x;
	}

	public int getWidth() {
		return width;
	}

}