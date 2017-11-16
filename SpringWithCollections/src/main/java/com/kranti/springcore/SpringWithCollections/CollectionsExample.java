package com.kranti.springcore.SpringWithCollections;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsExample {

	List<Employee> empList = null;
	Map<String,Employee> empMap = null;
	List<String> strList = null;

	CollectionsExample(List<Employee> empList, Map<String,Employee> empMap, List<String> strList) {
		this.empList = empList;
		this.empMap = empMap;
		this.strList = strList;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public Map<String, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<String, Employee> empMap) {
		this.empMap = empMap;
	}

	public List<String> getStrList() {
		return strList;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}
	
	public void displayMapOfEmp() {
		System.out.println("rendering Map "+this.empMap.size());
	    Set<Entry<String, Employee>> entrySet = this.empMap.entrySet();
	    Iterator itr = entrySet.iterator();
	    while(itr.hasNext()) {
	    		Entry<String, Employee> entry = (Entry<String, Employee>) itr.next();
	    		System.out.println(entry.getKey() + " : " + entry.getValue().getName() + " " + entry.getValue().getDesignation() + " " + entry.getValue().getDob());
	    }
	}
	
}
