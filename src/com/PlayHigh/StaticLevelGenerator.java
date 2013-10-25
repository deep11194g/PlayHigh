package com.PlayHigh;

/**
 * Generates levels Statically Entire Level Content is Generated at once.
 * 
 * @author Rushil Agrawal, Soumyadeep Ghosh
 */
public class StaticLevelGenerator extends LevelGenerator {

	public StaticLevelGenerator(int difficulty) {
		super(difficulty);
	}

	/**
	 * Generates and Returns a Level of Specified Length.
	 */
	public Level generate(int length) {
		Level lvl = new Level();

		for (int i = 0; i < length; i++) {
			Pattern p = get(rand.nextInt(size()));
			for (View v : p)
				lvl.add(v);
		}

		return lvl;
	}

}