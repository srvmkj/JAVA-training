package com.xyz.java.deloitte2c.coreapi;

public class Cats extends Animal implements Hunter, Jumper, Runner{

	public void hunt(){
		System.out.println("Cat is hunting.");
	}
	
	public void jump(){
		System.out.println("Cat is jumping.");
	}
	
	public void run(){
		System.out.println("Cat is running.");
	}
	
	public void move(int dist){
			System.out.println("Cat is moving "+dist+" distance.");
			System.out.println("cat moving");
	}
}
