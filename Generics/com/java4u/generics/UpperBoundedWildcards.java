package com.java4u.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {

	public static double sum(List<? extends Number> list) {
		double temp = 0;
		for (Number number : list) {
			temp = temp + number.doubleValue();
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(sum(Arrays.asList(1,3,4,4,4,5)));
		System.out.println(sum(Arrays.asList(1.3,4.4,6.6)));

	}

}
