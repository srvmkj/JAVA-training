package com.mypackage.deloitte;

import java.util.Date;

public class Marker_Demo {

	/*public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		Marker m1;
		m1 = new Marker();
		Marker m2;
		m2 = new Marker();
		System.out.println(m1.price);
		m2.price = 12.8;
		System.out.println(m2.price);
		System.out.println(m1.price + " " + m1.color + " " + m1.brand);		
	}*/
	public static void main1(String[] args) {
		Marker m1;
		m1 = new Marker("camlin");
		System.out.println(m1.brand);
		System.out.println(m1.getPrice());
		Marker m[] = new Marker[3];
		m[2]=m1;
		System.out.println(m[2].getPrice());
		
		
	}
	public static void main2(String[] args) {
		Marker m = new Marker();
		Date d = new Date();
		System.out.println(m + "\n" + d);
		System.out.println(m.toString() + "\n" + d.toString());
	}
	public static void main3(String[] args) {
		Marker m = new Marker();
		System.out.println(m.getPrice());
		m.setPrice(35.0);
		System.out.println(m.getPrice());
		m.setCategory("highlighter");
		System.out.println(m.category);
	}
	public static void main5(String[] args) {
		Marker m = new Marker();
		System.out.println(m.getPrice());
		try
		{
			m.setPrice(35.0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		System.out.println(m.getPrice());
		try
		{
			m.setPrice(-35.0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		System.out.println(m.getPrice());
	}
	public static void main(String[] args) {
		Marker m = new Marker();
		System.out.println(m.getColor());
		try
		{
			m.setColor("yellow");
		}
		catch(MarkerColorNotSupportedException e)
		{
			System.out.println(e);
		}
	}
}
