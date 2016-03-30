package com.java4u.generics;

public class GenericMethods {

	public static <T> void printData(T data) {
		System.out.println(data.toString());
	}

	public static void main(String[] args) {
		printData("Helloworld");
		printData(123.00);
		printData(33);
	}
}
