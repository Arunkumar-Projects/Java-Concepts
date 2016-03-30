package com.java4u.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildcards {

	public static void printData(List<?> list) {
		for (Object item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printData(Arrays.asList(1, 2, 2));
		printData(Arrays.asList("cc","bb","aa"));
	}

}
