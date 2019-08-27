/**
 * 
 */
package com.cricket.model;

import java.util.List;

/**
 * @author ajay
 *
 */
public class Teams {

	List<Batsmen> batsmens;
	List<Bowller> bowllers;
	
	public Teams() {

	}

	public List<Batsmen> getBatsmans() {
		return batsmens;
	}

	public void setBatsmans(List<Batsmen> batsmans) {
		this.batsmens = batsmans;
	}

	public List<Bowller> getBollers() {
		return bowllers;
	}

	public void setBollers(List<Bowller> bollers) {
		this.bowllers = bollers;
	}

	@Override
	public String toString() {
		return "Teams [batsmans=" + batsmens + ", bollers=" + bowllers + "]";
	}
	
	

}
