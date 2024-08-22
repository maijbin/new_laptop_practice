package com.codemind.b12.com.codemind.b12;

import java.util.Arrays;

public class Arrays_program {

	public static void main(String[] args) {
		int ar[]= {1,2,3,5,4,7,9,4};
		System.out.println("the length of an array is:"+ar.length);
		for(int i=0;i<ar.length;i++)
		{
		System.out.println("values in array are:"+ar[i]);
		
		}
		// sorting the array
		
		Arrays.sort(ar);
		System.out.println("Ascending order is:"+Arrays.toString(ar));
	
	}

}
