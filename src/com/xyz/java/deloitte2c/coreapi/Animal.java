package com.xyz.java.deloitte2c.coreapi;

public abstract class Animal extends Object{
	boolean alive;
	
	public Animal()
	{
		alive=true;
	}
	public void eat(){
		System.out.println("Animal is eating");
		
	}
	
/*	public void move(int distance)
	{
		System.out.println("Animal is moving: "+distance);
	} */

	public abstract void move(int dist);
}
