package com.xyz.java.deloitte2c;
//import java.util.Date;
public class MarkerDemo {
	
	
	public static void  main(String [] args){
		Marker m1=new Marker();
		System.out.println(m1.getPrice());
		m1.setPrice(35);
		System.out.println(m1.getPrice());
		System.out.println(Marker.category);
		Marker.setCategory("Writing Device");
		System.out.println(Marker.category);

	}
	
	
	/*public static void  main1(String [] args){
		Marker m1=new Marker();
		Date d1=new Date();
		System.out.println(m1.toString());
		System.out.println(d1.toString());
	}
	
	public static void main4(String[] args){
		Marker m1=new Marker();
		Marker m2=new Marker();
		m2.setPrice(28.6);
		m1.setPrice(35.5);
		//System.out.println(getCategory());
	}
	
	
	public static void main3(String[] args){
		Marker[] m;
		m=new Marker[3];
		System.out.println(m);
		System.out.println(m.hashCode());
		System.out.println(m[2]);
		
		m[2]=new Marker();
		System.out.println(m[2].getPrice());
	}
	
	
	
	
	public static void main2(String args[]){
		Marker m1=new Marker();
		m1.write("Hey There !");
	}
	
	
	
	public static void main1(String[] args){
		Marker m1=new Marker("Reynolds", "Blue", 28.5);
		System.out.println(m1.getPrice());
		m1.setPrice(0);
		System.out.println(m1.getPrice());
		
		
	}*/

}
