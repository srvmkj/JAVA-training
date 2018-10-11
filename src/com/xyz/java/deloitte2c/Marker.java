package com.xyz.java.deloitte2c;

public class Marker {
	
	public static String category= "pen";
	final String brand;
	private String color;
	private double price;
	
	public final static String BLUE;
	public final static String RED;
	public final static String GREEN;
	public final static String BLACK;
	
	static
	{
		BLUE = "Blue";
		BLACK = "Black";
		GREEN = "Green";
		RED = "Red";
	}
	
	
	
	public Marker(){
		price = 20.0;
		color = "black";
		brand = "camlin";
	}
	public Marker(String b){
		brand = b;
		price = 20.0;
		color = "black";
	}
	public Marker(String b,String c,double p){
		brand = b;
		color = c;
		price = p;
	}
	public double getPrice()
	{
		return price;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		switch (color)
		{
		case "Blue":
		case "Green":
		case "Black":
		case "Red":
			this.color = color;
			break;
		default: 
			throw new MarkerColorNotSupportedException();
		}
	}
	public void setPrice(double price) throws IllegalArgumentException
	{
		if(price > 0)
			 this.price = price;
		else
			throw new IllegalArgumentException();
		
	}
/*	public static void printPrice()
	{
		System.out.println(price);
	}*/
	public static void setCategory(String category)
	{
		Marker.category = category;
	}

}
