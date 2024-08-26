package com.codemind.b12.com.codemind.b12;

public class Interface_example {

	public static void main(String[] args) {

		Impclass imp=new Impclass();
		imp.add();
		imp.test();
	}

}
interface Myfirstinterface
{
	//variables
	public static final int a=100;
	float b=200;
	
	//methods
	public abstract void test();
	void add();
	
}

class Impclass implements Myfirstinterface
{

	@Override
	public void test() {
		
		System.out.println("this is test method from interface");
	}

	@Override
	public void add() {
		
		System.out.println("this is add method from interface");
	}
	
}
