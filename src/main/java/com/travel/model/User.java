package com.travel.model;

public class User {
	
	Redbus redbus;

	public void reachDestination() {
		
		redbus.travel();
	}

	public Redbus getRedbus() {
		return redbus;
	}

	public void setRedbus(Redbus redbus) {
		this.redbus = redbus;
	}
	
	

}
