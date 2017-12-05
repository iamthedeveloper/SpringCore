package com.kranti.springmultixml.Springwithmultiplexmls.dao;

import java.util.List;

import com.kranti.springmultixml.Springwithmultiplexmls.model.Person;

public interface PersonDAO {

	public void insert(Person person);

	public void insertBatch(List<Person> persons);
}
