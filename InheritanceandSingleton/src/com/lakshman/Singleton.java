package com.lakshman;

public class Singleton {

	private static Singleton sObject;
	
	private Singleton() {
		
	}
	
	public synchronized static Singleton getInstance() {
		if(sObject==null) {
			System.out.println("I am now creating a new Instance");
			sObject = new Singleton();
		}	
		return sObject;
	}
	public void loadDetails() {
		System.out.println("I am from load details");
	}
}
