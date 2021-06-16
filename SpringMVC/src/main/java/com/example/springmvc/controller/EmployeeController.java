package com.example.springmvc.controller;

import com.example.springmvc.model.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private List<Employee> employees;
    @PostConstruct
    private void loadData(){

        Employee e1 = new Employee(1,"Nong", "Hung", "hung@gmail.com");
        Employee e2 = new Employee(2,"Nong", "Thai", "thai@gmail.com");
        Employee e3 = new Employee(3,"Nong", "Manh", "manh@gmail.com");
        employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        model.addAttribute("employees",employees);
        return "list_employees";
    }
}
