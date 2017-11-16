package com.kranti.springcore;

import java.util.Date;

public class Employee {

	public Date getDob() {
		return doj;
	}
	public void setDob(Date dob) {
		this.doj = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(Date doj, Address address, User user) {
		super();
		this.doj = doj;
		this.address = address;
		this.user = user;
	}
	
	
	public void showEmployeeInfo() {
		System.out.println("Employee Info: \n"
				+ "Name: " +this.getUser().getName() +" \n"
				+ "DOB: " +this.getDob() + "\n"
				+ "Address:"+ this.getAddress().getCity() +" "+this.getAddress().getZipcode());
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	private Date doj;
	private Address address;
	private User user;
	
}
