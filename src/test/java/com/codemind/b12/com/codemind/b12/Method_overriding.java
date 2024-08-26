package com.codemind.b12.com.codemind.b12;

public class Method_overriding {

	public static void main(String[] args) {
		Twowheeler_vehicle tw=new Twowheeler_vehicle();
		tw.change_gear();
		System.out.println("suzuki"+tw.manufacturer);
		
	}

}
class vehicle_1
{
	String manufacturer;
	String color;
	public void change_gear()
	{
		System.out.println("4 wheeler gear changing mechanism");
	}
	public void break_system()
	{
		
	}
}
class Twowheeler_vehicle extends vehicle_1
{
	public void change_gear()
	{
		System.out.println("2 wheeler gear changing mechanism");
	}
}
