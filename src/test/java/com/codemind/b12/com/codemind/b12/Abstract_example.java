package com.codemind.b12.com.codemind.b12;

public class Abstract_example {

	public static void main(String[] args) {

		Abstract_example2 abs=new Abstract_example2();
		abs.addition(10, 20);
		
	}

}

abstract class Myabstractclass{
	int a;
	public abstract void addition(int a,int b);
	
	public void substraction()
	{
		System.out.println(10-5);
	}
}
