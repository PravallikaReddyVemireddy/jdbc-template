package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Employee;

public interface EmployeeDAO {
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	 * @return 
	    */
	   
	   public void create(String name, Integer age,Integer id);
	   
	   public Employee getEmployee(Integer id);
	  
	   public List<Employee> listEmployees();
	  
	   public void delete(Integer id);
	  
	   public void update(Integer id, Integer age);


}
