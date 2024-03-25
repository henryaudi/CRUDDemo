package com.springproject.springboot.cruddemo.dao;

import com.springproject.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
