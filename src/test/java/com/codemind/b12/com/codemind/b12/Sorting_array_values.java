package com.codemind.b12.com.codemind.b12;

public class Sorting_array_values {

	public static void main(String[] args) {
		int arr[]= {10,80,60,40,30,20,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])  // for desc j>i
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("The ascending order values are:"+arr[k]);
			//System.out.println(arr[k]);
		}

	}

}
