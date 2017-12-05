package com.kranti.springmultixml.Springwithmultiplexmls.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setCountry(rs.getString("country"));
		person.setName(rs.getString("name"));
		person.setId(rs.getInt("id"));
		return person;
	}

}
