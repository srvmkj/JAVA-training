package com.xyz.java.deloitte2c.coreapi;
import java.util.Calendar;
public class CalendarDemo {
	public static void main(String args[]){
		Calendar c1=Calendar.getInstance();
		System.out.println(c1);
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
	
	}

}
