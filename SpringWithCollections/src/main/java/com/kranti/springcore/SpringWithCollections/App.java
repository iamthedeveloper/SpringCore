package com.kranti.springcore.SpringWithCollections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Resource resource = new ClassPathResource("app-collection-context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		CollectionsExample collectionExmp = (CollectionsExample) factory.getBean("collectionsBean");
		collectionExmp.displayMapOfEmp();

	}
}
