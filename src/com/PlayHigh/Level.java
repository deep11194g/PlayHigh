package com.PlayHigh;

import java.io.*;
import java.util.Vector;

/**
 * An independent unit Representing a single Level Holds Content of Entrie Level
 * as Sequence of Views.
 * 
 * @author Rushil Agrawal, Soumyadeep Ghosh
 */
public class Level extends Vector<View> implements Serializable {

	public Level() {
		super(1, 1);
	}

	/**
	 * Saves Level to Specified File as Byte-Stream
	 */
	public void save(String filename) throws IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(this);
		} catch (Exception e) {
			throw new IOException("Could not save level to file: " + filename);
		}

		try {
			if (oos != null)
				oos.close();
		} catch (Exception e) {
			throw new IOException("Could not save level to file: " + filename);
		}
	}

	/**
	 * Loads Level From Specified File
	 */
	public static Level load(String filename) throws IOException {
		Level lvl = null;
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream(filename));
			lvl = (Level) ois.readObject();
		} catch (Exception e) {
			throw new IOException("Could not load level from file: " + filename);
		}

		try {
			if (ois != null)
				ois.close();
		} catch (Exception e) {
			throw new IOException("Problem closing file: " + filename);
		}

		return lvl;
	}

}