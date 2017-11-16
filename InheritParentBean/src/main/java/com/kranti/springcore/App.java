package com.kranti.springcore;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * @author App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" + new Date());
        Resource resource = new ClassPathResource("inherit-context.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee eployee = (Employee)factory.getBean("employee");
        eployee.showEmployeeInfo();
    }
}
