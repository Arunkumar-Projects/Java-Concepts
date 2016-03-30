package com.java4u.generics;

public class BoundedTypes {

	public static <T extends Comparable<T>> T calculateMin(T t1, T t2){
		if(t1.compareTo(t2)<0){
			return t1;
		}
		return t2;
		
	}
	public static void main(String[] args) {
		System.out.println(calculateMin(22, 32));
		System.out.println(calculateMin(22, 22));
		System.out.println(calculateMin("Arun", "Aran"));
	}

}
