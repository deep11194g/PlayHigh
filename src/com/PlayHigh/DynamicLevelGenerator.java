package com.PlayHigh;
import java.util.Iterator;
/**
 *Generates Levels Dynamically, in Real-time.
 *Level content generated one view at a time.
 * 
 * @author Rushil Agrawal, Soumyadeep Ghosh *
 */
public class DynamicLevelGenerator extends LevelGenerator
								   implements Iterator<Pattern>
{
	
	/**
	 * Initializes Object with specified Difficulty
	 */
	public DynamicLevelGenerator(int difficulty) {
		super(difficulty);
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	/**
	 * Returns a Randomly selected View 
	 */
	@Override
	public Pattern next() {
		return get(rand.nextInt(size()));
	}

	@Override
	public void remove() {
		System.err.println("WARNING: remove() in LevelGenerator is not a supported operation.");
	}

}
