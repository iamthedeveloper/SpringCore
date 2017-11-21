package com.kranti.springaop.model;

public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Sample Exception");
	}	
}