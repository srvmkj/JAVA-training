package com.xyz.java.deloitte2c;

public class Marker {
	public static String category="Pen";
	final String brand;
	String color;
	private double price;
	public Marker(){
		//System.out.println("Marker object created");
		price=25.0;
		brand="Camlin";
		color="black";
	}
	public static void setCategory(String category)
	{
		Marker.category=category;
	}
	public Marker(String b, String c, double price){
		brand=b;
		color=c;
		this.price=price;
	}
	
		
	public void setPrice(double price){
		if (this.price > 0)
			this.price=price;
		else
			System.out.println("Invalid price");
	}
	public double getPrice(){
		return price;
	}
	
	public void write(String input){
		System.out.println(input);
	}
}
