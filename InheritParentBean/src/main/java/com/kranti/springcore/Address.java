package com.kranti.springcore;

public class Address {

	public Address(String city, int zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
	}

	private String city;
	private int zipcode;

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
