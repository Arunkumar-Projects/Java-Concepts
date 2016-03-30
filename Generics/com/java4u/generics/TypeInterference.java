package com.java4u.generics;

import java.util.ArrayList;
import java.util.List;

class Bucket<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

public class TypeInterference {
	
public static <T> void addStore(T t,List<Bucket<T>> list){
	Bucket<T> bucket= new Bucket<>();
	bucket.setT(t);
	list.add(bucket);
	System.out.println(t.toString() +"  is added to list...");
}

public static void main(String[] args) {
	List<Bucket<String>> list= new ArrayList<>();
	
	// type Interference
	TypeInterference.addStore("Hello", list);
	
	//type witness
	TypeInterference.<String>addStore("Arun", list);
}
}
