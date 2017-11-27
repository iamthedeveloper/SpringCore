package com.kranti.springorm;

/**
 * SpringHibernateMain
 *
 */
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kranti.springorm.dao.PersonDAO;
import com.kranti.springorm.model.Person;


public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-orm-context.xml");
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("Kranti_Developer"); person.setCountry("USA");
		
		personDAO.save(person);
		
		System.out.println("Person::"+person);
		
		List<Person> list = personDAO.list();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		//close resources
		context.close();	
	}
}