package com.kranti.springcore;

import java.util.Date;

public class User {

	public Date getUserDate() {
		return dob;
	}

	public void setUserDate(Date userDate) {
		this.dob = userDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public User(String name, Date date) {
		this.name = name;
		this.dob = date;
	}

	private Date dob = null;
	private String name = null;
	
}
