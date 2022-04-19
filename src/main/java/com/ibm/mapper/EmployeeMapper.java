package com.ibm.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.ibm.bean.Employee;


public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		  Employee employee = new Employee();
		  employee.setId(rs.getInt("id"));
		  employee.setName(rs.getString("name"));
		  employee.setAge(rs.getInt("age"));
	      return employee;
		
	}

}