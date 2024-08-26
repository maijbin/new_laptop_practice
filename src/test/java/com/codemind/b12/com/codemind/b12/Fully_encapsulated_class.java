package com.codemind.b12.com.codemind.b12;

public class Fully_encapsulated_class {
	
	public static void main(String[] args) {
		Accessingprivatemembers acp=new Accessingprivatemembers();
		acp.setA(10);
		System.out.println(acp.getA());
	}

}
class Accessingprivatemembers
{
	private int a;
	private float b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

}
