package com.example.ebtest.service;

import com.example.ebtest.entity.employee;
import com.example.ebtest.repository.EmployeeRepo;
import com.example.ebtest.response.EmployeeResponse;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper mapper;

	public EmployeeResponse getEmployeeById(int id) {
		Optional<employee> employee = employeeRepo.findById(id);
		EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
		return employeeResponse;
	}

}
