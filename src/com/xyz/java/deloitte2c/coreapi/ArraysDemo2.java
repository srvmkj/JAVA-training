package com.xyz.java.deloitte2c.coreapi;

public class ArraysDemo2 {
	public static void main(String[] args){
		int [][] a={{12,15},{16,20,36,84},{37,21,22},{16}};
		int i,j;
		
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

}
