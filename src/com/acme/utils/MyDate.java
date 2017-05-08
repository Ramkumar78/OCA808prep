package com.acme.utils;

public class MyDate {

	
public	 int day=1;
	 public int month=1;
	 public int year=2000;
	
	public MyDate(){}
	
	public MyDate(int m, int d, int y) {
		setDate(m,d,y);
		
	}

	public String toString(){
		
		return month +"/" + day +"/"+year;
		
	}

	public void setDate(int m, int d, int y) {
		// TODO Auto-generated method stub
		day=d;
		month=m;
		year=y;
	}
	

	
	

}
