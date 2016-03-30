package com.java4u.generics;

class Store<T> {
	private T item;

	public void setStore(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return item.toString();
	}
}

class HashTable<K, V> {
	private K key;
	private V value;

	public HashTable(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return key.toString() + "->" + value.toString();

	}
}

public class GenericTypes {

	public static void main(String[] args) {
		// Raw types-- avoid raw types always.
		Store store = new Store();
		store.setStore("ssss");
		System.out.println(store.toString());

		// to Avoid raw types
		Store<String> store1 = new Store<String>();
		store1.setStore("double");
		System.out.println(store1.toString());

		Store<Integer> intValue = new Store<>();
		intValue.setStore(124);

		System.out.println(intValue.toString());

		Store<Double> doubleValue = new Store<>();
		doubleValue.setStore(124.00);

		System.out.println(doubleValue.toString());
		
		//Key -Value pair testing
		HashTable<String, Integer> hashTable= new HashTable<String, Integer>("Apple", 123);
		System.out.println(hashTable);

	}

}
