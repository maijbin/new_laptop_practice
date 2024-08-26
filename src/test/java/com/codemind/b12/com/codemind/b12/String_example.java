package com.codemind.b12.com.codemind.b12;

public class String_example {

	public static void main(String[] args) {

		String str = "Hello, World!";
        
        // Length
        System.out.println("Length: " + str.length());
        
        // Substring
        System.out.println("Substring: " + str.substring(7, 12));
        
        // Replace
        System.out.println("Replace: " + str.replace("World", "Java"));
        
        // To Upper Case
        System.out.println("Upper Case: " + str.toUpperCase());
        
        // Trim (with extra spaces)
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");
	}

}
