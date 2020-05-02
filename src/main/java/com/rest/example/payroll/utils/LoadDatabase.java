package com.rest.example.payroll.utils;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rest.example.payroll.models.Employee;
import com.rest.example.payroll.repositories.EmployeeRepository;

@Configuration
@Slf4j
class LoadDatabase {
  
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
    log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
    log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
    };
  }
}