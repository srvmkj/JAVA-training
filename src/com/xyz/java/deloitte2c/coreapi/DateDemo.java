package com.xyz.java.deloitte2c.coreapi;

import java.util.Date;
public class DateDemo {
	public static void main(String[] args){
	
		Date d1=new Date();
		Date d2=new Date();
		
		System.out.println(d2.getTime());
		d2.setTime(d2.getTime() + 5000000);
		
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		
		Class c1=d1.getClass();
		System.out.println(c1);

	}

}
