package com.acme.polymorphism;

public class Car extends Automobile {
	
	public static void main(String[] args) {
		
	System.out.println(getVin());
	Automobile Auto=new Automobile();
	Auto.getVin();
	System.out.println(getVin());
		
	}

	

}
