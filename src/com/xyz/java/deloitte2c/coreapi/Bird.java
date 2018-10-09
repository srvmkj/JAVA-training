package com.xyz.java.deloitte2c.coreapi;

public class Bird extends Animal{

	public void flying(int distance){
		System.out.println("Bird is flying: "+distance+" distance");
	}
	
	public void eat(){
		System.out.println("Bird is eating");
	}

	@Override
	public void move(int dist) {
		// TODO Auto-generated method stub
		
	}
}
