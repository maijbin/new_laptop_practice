package com.codemind.b12.com.codemind.b12;

public class Inheritance_example {

	public static void main(String[] args) {
		twowheeler t=new twowheeler();
		t.running();
System.out.println(t.color);
Bicycle b=new Bicycle();
b.running();
System.out.println(b.RTOregistration);
	}

}
class Vehicle
{
	String RTOregistration="mh13 1234";
	String color="black";
	
	public void running()
	{
		System.out.println("Vehicle is running");
	}
}
class twowheeler extends Vehicle
{
	int wheels=4;
}
class Bicycle extends twowheeler
{
	String manufacturer="maruti suzuki";
}
class Fourwheeler extends Vehicle
{
	int numofvehicle=2;
}