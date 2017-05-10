package com.acme.polymorphism;

public class Automobile {

	private static int vincount=3_818_202;
	
	private static int vin;
	
	public static int getVin(){
		
		return vin;
	}

	
	public Automobile(){
		vin=vincount++;
	}
	
}
