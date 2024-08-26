package com.codemind.b12.com.codemind.b12;

public class Inheritance_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child p=new child();
		p.working();
		System.out.println(p.name);
	}

}
class Parent
{
	//Properties
	String name="mahi";
	float age=30.2f;
	
	//Behaviour
	public void working()
	{
		System.out.println("Parent is working");
	}
}
class child extends Parent
{
	String departmen="IT";
	String color="white";
}