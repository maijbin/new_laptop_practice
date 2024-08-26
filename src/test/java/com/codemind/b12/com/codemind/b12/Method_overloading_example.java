package com.codemind.b12.com.codemind.b12;

public class Method_overloading_example {

	public static void main(String[] args) {
		child1 c=new child1();
		c.addition();
c.addition(20);
c.addition(10f, 20f);
c.addition(10,30f);
c.addition(20,40);

	}

}
class Parent1
{
	public void addition()
	{
		System.out.println("Without argument");
	}
	public void addition(int a)
	{
		System.out.println("The value of a is:"+a);
	}
	public void addition(int a, int b)
	{
		System.out.println("The addition of a and b is:"+(a+b));
	}
	public void addition(int a, float b)
	{
		System.out.println("The addition of int a and float b:"+(a+b));
	}
	public void addition(float a, float b)
	{
		System.out.println("The addition of float values are:"+(a+b));
	}
}
class child1 extends Parent1
{
	public void addition(int a, float b)
	{
		System.out.println("The addition is:"+(a+b));
	}
}