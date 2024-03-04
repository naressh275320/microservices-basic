package com.example.ebtest.repository;

import com.example.ebtest.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<employee, Integer> {
//Check repo
}
