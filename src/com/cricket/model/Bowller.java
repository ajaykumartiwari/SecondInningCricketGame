/**
 * 
 */
package com.cricket.model;

/**
 * @author ajay
 *
 */
public class Bowller {

	String bowllerName;
	String bowllerDLevel;
	
	public Bowller() {
		// TODO Auto-generated constructor stub
	}

	public String getBowllerName() {
		return bowllerName;
	}

	public void setBowllerName(String bowllerName) {
		this.bowllerName = bowllerName;
	}

	public String getBowllerDLevel() {
		return bowllerDLevel;
	}

	public void setBowllerDLevel(String bowllerDLevel) {
		this.bowllerDLevel = bowllerDLevel;
	}

	@Override
	public String toString() {
		return "Bowller [bowllerName=" + bowllerName + ", bowllerDLevel=" + bowllerDLevel + "]";
	}
	
	
}
