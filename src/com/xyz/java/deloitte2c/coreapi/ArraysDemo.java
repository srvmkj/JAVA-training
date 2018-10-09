package com.xyz.java.deloitte2c.coreapi;

public class ArraysDemo {
	public static void main(String[] arga){
		int[] a={19,12,21,41,14,15,54,};
		int j,i,temp;
		for (i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}
}
