package com.samaresh.java;

public interface MyInterface {
	
	public void getName();

	public default void getData() {
		System.out.println("This is from default method");
	}

	public static void getDetails() {
		System.out.println("This is from Static method");
	}

}
