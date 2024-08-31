package com.codemind.b12.com.codemind.b12;


public class Exception_handling {

	
	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            int result = numbers[5]; // This will throw ArrayIndexOutOfBoundsException
	            System.out.println(result);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Index out of bounds: " + e.getMessage());
	        } finally {
	            System.out.println("This will always execute");
	        }
	    }
	}

