package com.codemind.b12.com.codemind.b12;

public class count_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "pomashgcscpomsccpomgvpomvdgvpomcpom";
	        String substring = "pom";
	        
	        int count = 0;
	        int index = 0;
	        
	        // Loop to find all occurrences
	        while ((index = input.indexOf(substring, index)) != -1) {
	            count++;
	            index += substring.length(); // Move past the last found occurrence
	        }
	        
	        System.out.println("Count of 'pom': " + count);
	}

}
