package com.samaresh.java;

public class Test implements MyInterface{
	
	@Override
	public default void getData() {
		System.out.println("This is from Test class");
		
	}

	@Override
	public void getName() {
		System.out.println("This is from Test class");
		
	}
	
	public static void main(String[] args) {
		new Test().getName();
		new getData();
	}
	
	
	
	

}
