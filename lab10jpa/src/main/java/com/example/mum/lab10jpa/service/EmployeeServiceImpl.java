package com.example.mum.lab10jpa.service;

import com.example.mum.lab10jpa.domain.Employee;
import com.example.mum.lab10jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();

    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeeByPhone(String phone) {
        return employeeRepository.locateOneEmployeeByHisNumber(phone);
    }
}
