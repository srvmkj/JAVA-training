package com.xyz.java.deloitte2c.coreapi;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book(120, "2 States", "Chetan Bhagat", "Divya Publicatins");
		
		System.out.println("Book is Opened: "+b1.isOpen());
		System.out.println("Book is Closed: "+b1.isClosed());
		
		b1.open();
		System.out.println(b1.getDetails());
		b1.open(24);
		b1.turnLeft();
		System.out.println("Current PAge: "+b1.getPage());
		
	}

}
