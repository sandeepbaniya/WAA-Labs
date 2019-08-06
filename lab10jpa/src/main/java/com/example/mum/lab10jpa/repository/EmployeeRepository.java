package com.example.mum.lab10jpa.repository;

import com.example.mum.lab10jpa.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("from Employee e where e.phoneNumber=:phone")
   List<Employee> locateOneEmployeeByHisNumber(String phone);
}
