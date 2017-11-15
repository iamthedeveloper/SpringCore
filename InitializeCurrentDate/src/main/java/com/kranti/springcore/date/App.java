package com.kranti.springcore.date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Resource resource = new ClassPathResource("my-app-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        InitializeCurrentDate currentDate = (InitializeCurrentDate)beanFactory.getBean("dateBean");
        currentDate.getTodaysDate();
        
    }
}
