package com.codemind.b12.com.codemind.b12;

public class String_program {

	public static void main(String[] args) {

		String s="Welcome to codemind$";
		System.out.println("Characters are in strings are:"+s.length());
		System.out.println("concating s with another string:\n"+s.concat(" pune branch"));
		System.out.println("replacing small letter c to capital letter:\n"+s.replace('c', 'C'));
		System.out.println("After replacing dollar with blank:\n"+s.replace("$", ""));
		System.out.println("#######################################");
		String ss="pomds5331321sfhvpom75AA53gffgxv645435cvpom";
		
		// take numbers from above string
		System.out.println(ss.replaceAll("[^0-9]", ""));
		
		//take a to z capital and small from above string
		System.out.println(ss.replaceAll("[^a-z,A-Z]", ""));
		System.out.println("count pom:"+ss.replaceAll("[^pom]", ""));
		
		// the count of specific repetition
		String n=ss.replaceAll("[^pom]", "");
		System.out.println("count of pom in string ss are:"+n);
		System.out.println("####################################");
		//split the string
		String[] arr=ss.split("[m]");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
