package com.lakshman;

public class Demo {

	public static void main(String[] args) {
		System.out.println("I am from main 1");
		Singleton s = Singleton.getInstance();
		s.loadDetails();
		System.out.println(s);
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
	}

}
