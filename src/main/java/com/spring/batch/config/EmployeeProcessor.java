package com.spring.batch.config;


import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.entity.Employee;

public class EmployeeProcessor implements ItemProcessor<Employee,Employee> {

	@Override
	public Employee process(Employee employee) throws Exception {
		employee.setBasic(employee.getCtc()*20/100);
		employee.setDa(employee.getCtc()*20/100);
		employee.setHra(employee.getCtc()*20/100);
		employee.setLta(employee.getCtc()*20/100);
		employee.setOtherallowance(employee.getCtc()-(employee.getDa()+employee.getHra()+employee.getLta()+employee.getBasic()));
		return employee;
	}
}
