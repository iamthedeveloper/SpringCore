package com.kranti.springorm.dao;
import java.util.List;

import com.kranti.springorm.model.Person;


public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}