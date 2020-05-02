package com.rest.example.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rest.example.payroll.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
