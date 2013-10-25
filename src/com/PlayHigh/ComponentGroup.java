package com.PlayHigh;
import java.util.Vector;


/**
 * Group of Components treated as a single unit
 * 
 * @author Rushil Agrawal, Soumyadeep Ghosh
 */
public class ComponentGroup extends Component {
	
	private Vector<Component> v;
	
	public ComponentGroup() {
		v = new Vector<Component>(1,1);
	}
	
	/**
	 * Initializes new Component Group with specified Location 
	 */
	 public ComponentGroup(int x, int y) {
		this();
		setPosition(x, y);
	}
	
	/**
	 * Returns Component Vector
	 */
	public Vector<Component> getComponents() {
		return v;
	}
	
	/**
	 * Pass a Component Vector
	 */
	public void setComponents(Vector<Component> v) {
		this.v=v;
	}
}