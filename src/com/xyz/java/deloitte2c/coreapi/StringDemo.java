package com.xyz.java.deloitte2c.coreapi;

public class StringDemo {
	public static void main(String [] args)
	{
		String s1= "  Java Programming Language";
		System.out.println(s1.length());
		System.out.println(s1.charAt(9));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1.hashCode());
		String s2= "Language";
		System.out.println(s2.hashCode());
		System.out.println(s1.substring(12));
		System.out.println(s1.substring(12,20));
		System.out.println(s1.startsWith("  "));
		System.out.println(s1.isEmpty());
		System.out.println(s1.trim().startsWith("  "));
	}

}
