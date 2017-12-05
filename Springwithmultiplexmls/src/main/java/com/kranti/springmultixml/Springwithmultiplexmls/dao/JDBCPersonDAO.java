package com.kranti.springmultixml.Springwithmultiplexmls.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.kranti.springmultixml.Springwithmultiplexmls.model.Person;

public class JDBCPersonDAO extends JdbcDaoSupport implements PersonDAO {

	public void insert(Person person) {

		String sql = "INSERT INTO PERSON " + "(country, name, id) VALUES (?, ?, ?)";

		getJdbcTemplate().update(sql, new Object[] { person.getCountry(), person.getName(), person.getId() });

	}

	public void insertBatch(final List<Person> persons) {

		String sql = "INSERT INTO PERSON  " + "(country, name, id) VALUES (?, ?, ?)";

		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Person person = persons.get(i);
				ps.setString(1, person.getCountry());
				ps.setString(2, person.getName());
				ps.setInt(3, person.getId());
			}

			public int getBatchSize() {
				return persons.size();
			}
		});
	}
}
