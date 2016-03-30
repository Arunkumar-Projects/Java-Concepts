package com.java4u.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {

	public static void add(List<? super Integer> list){
		for(int i=0;i<10;i++){
			list.add(i);
		}
	}
	public static void main(String[] args) {
		add(Arrays.asList());
	}

}
