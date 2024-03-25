package com.springproject.springboot.cruddemo.service;

import com.springproject.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
