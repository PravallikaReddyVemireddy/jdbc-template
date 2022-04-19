package com.ibm.application;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan({"com.ibm.*"})
@EnableAutoConfiguration
@EnableWebMvc
//@Import({JDBCConfiguration.class})
public class CrsIbmG4SpringJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsIbmG4SpringJdbcTemplateApplication.class, args);
//ApplicationContext context=SpringApplication.run(JDBCConfiguration.class, args);
//		
//		// remaining code will write after the break
//		
//		// perform operation @Employee
//		
//	EmployeeDAOImpl employeeJDBCTemplate = 
//			context.getBean(EmployeeDAOImpl.class);
//				
//	// method call here 
//	runEmployeeCRUD(employeeJDBCTemplate);
//	
//	}
//	 public static void runEmployeeCRUD(EmployeeDAOImpl 
//	    		employeeJDBCTemplate) {
//		
//			
//			System.out.println("------Records Creation--------");
//			employeeJDBCTemplate.create("siddu", 11);
//			employeeJDBCTemplate.create("bano", 2);
//			employeeJDBCTemplate.create("gridhar", 15);
//
//			System.out.println("------Listing Multiple Records--------");
//			List<Employee> employees = employeeJDBCTemplate.listEmployees();
//			for (Employee record : employees) {
//				System.out.print("ID : " + record.getId());
//				System.out.print(", Name : " + record.getName());
//				System.out.println(", Age : " + record.getAge());
//			}
//			
//	/*
//			System.out.println("----Updating Record with ID = 2 -----");
//			employeeJDBCTemplate.update(2, 20);
//	*/
////			System.out.println("----Listing Record with ID = 2 -----");
////			Employee employee = employeeJDBCTemplate.getEmployee(2);
////			System.out.print("ID : " + employee.getId());
////			System.out.print(", Name : " + employee.getName());
////			System.out.println(", Age : " + employee.getAge());
//
//			
//			
//		}
//	
	}
}
