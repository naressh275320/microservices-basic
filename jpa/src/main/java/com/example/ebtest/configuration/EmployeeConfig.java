package com.example.ebtest.configuration;

import com.example.ebtest.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeService employeeBean() {
		//Working clean test
		return new EmployeeService();
	}

	@Bean
	public ModelMapper modelMapperBean() {
		return new ModelMapper();
	}

}
