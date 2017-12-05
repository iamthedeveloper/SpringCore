package com.kranti.springmultixml.Springwithmultiplexmls.common;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kranti.springmultixml.Springwithmultiplexmls.dao.PersonDAO;
import com.kranti.springmultixml.Springwithmultiplexmls.model.Person;


public class JdbcTemplateApp 
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	 	PersonDAO personDAO = (PersonDAO) context.getBean("personDAO");
         Person person1 = new Person("India", "Kranti",25);
         Person person3 = new Person("USA", "KK",30);
         Person person2 = new Person("UK", "Kumar",32);
  
         List<Person> persons = new ArrayList<Person>();
         persons.add(person1);
         persons.add(person2);
         persons.add(person3);
  
         personDAO.insertBatch(persons);
       
    }
}