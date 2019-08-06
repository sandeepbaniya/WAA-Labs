package com.example.mum.lab10jpa.controller;


import com.example.mum.lab10jpa.domain.Employee;
import com.example.mum.lab10jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/add")
    public String getEmployeeForm(@ModelAttribute("employee") Employee employee){
        return "EmployeeForm";
    }

    @PostMapping("/add")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.saveEmployee(employee);
        return "redirect:/detailPage";

    }

    @GetMapping("/detailPage")
    public String employeeDetails(Model model){

        model.addAttribute("employees",employeeService.getAllEmployee());
        return "EmployeeDetails";
    }


}
