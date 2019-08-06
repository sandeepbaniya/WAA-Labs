package com.example.mum.lab10jpa.service;

import com.example.mum.lab10jpa.domain.Employee;

import java.util.List;



public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee saveEmployee(Employee employee);

    public List<Employee> getEmployeeByPhone(String phone);


}
