package com.PlayHigh;

import java.util.Vector;

/**
 * Contains layout of a Level. Ordered Collection of Views which occur
 * sequentially Particular order of Views(List) crucial
 * 
 * Write modularity contract
 *  * 
 * @author Rushil Agrawal, Soumyadeep Ghosh
 */
public class Pattern extends Vector<View> {

	public Pattern() {
		super(1, 1);
	}

	/**
	 * Returns Difficulty as Average of all Views
	 */

	public int getDifficulty() {
		int sum = 0;

		for (View v : this)
			sum += v.getDifficulty();

		return sum / size();
	}

}