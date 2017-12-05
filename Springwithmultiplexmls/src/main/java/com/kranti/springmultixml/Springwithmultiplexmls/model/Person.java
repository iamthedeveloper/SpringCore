package com.kranti.springmultixml.Springwithmultiplexmls.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 4385865671697493735L;

	private String name;
	private int id;
	private String country;

	public Person() {

	}

	public Person(String country, String name, int id) {
		this.country = country;
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
