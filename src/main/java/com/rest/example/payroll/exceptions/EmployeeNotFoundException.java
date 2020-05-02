package com.rest.example.payroll.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException {

  public EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}