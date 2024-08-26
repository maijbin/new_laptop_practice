package com.codemind.b12.com.codemind.b12;

class Method_overloading1 {
	 public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	}

	// Derived class
	class AdvancedCalculator extends Method_overloading1 {
	    
	    // Overloaded method in the derived class
	    public int add(int a, int b, int c, int d) {
	        return a + b + c + d;
	    }

	    // Optionally override a method from the base class
	    @Override
	    public double add(double a, double b) {
	        // Custom implementation in derived class
	        return super.add(a, b) + 1; // Adds 1 to the result
	    }
	}

	public class Method_overloading {
	    public static void main(String[] args) {
	        // Create instances of base and derived classes
	    	Method_overloading1 basicCalc = new Method_overloading1();
	        AdvancedCalculator advancedCalc = new AdvancedCalculator();
	        
	        // Call overloaded methods
	        System.out.println("Base Class Methods:");
	        System.out.println("Addition of 2 and 3 (int): " + basicCalc.add(2, 3));
	        System.out.println("Addition of 1.5 and 2.5 (double): " + basicCalc.add(1.5, 2.5));
	        System.out.println("Addition of 1, 2, and 3 (int): " + basicCalc.add(1, 2, 3));

	        System.out.println("\nDerived Class Methods:");
	        System.out.println("Addition of 1, 2, 3, and 4 (int): " + advancedCalc.add(1, 2, 3, 4));
	        System.out.println("Addition of 1.5 and 2.5 (double) in derived class: " + advancedCalc.add(1.5, 2.5));
	    }
	}

	
