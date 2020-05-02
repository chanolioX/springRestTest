package com.rest.example.payroll.restAPIUtils;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import com.rest.example.payroll.models.Employee;
import com.rest.example.payroll.controllers.EmployeeController;

@Component
public class EmployeeModelAssembler implements 
RepresentationModelAssembler<Employee, EntityModel<Employee>> 
{

  @Override
  public EntityModel<Employee> toModel(Employee employee) {

    return new EntityModel<>(employee,
      linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
      linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
  }
}