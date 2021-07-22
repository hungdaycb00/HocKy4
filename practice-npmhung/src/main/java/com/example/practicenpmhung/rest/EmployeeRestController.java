package com.example.practicenpmhung.rest;

import com.example.practicenpmhung.dao.EmployeeRepository;
import com.example.practicenpmhung.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeRestController(EmployeeRepository theEmployeeRepository) {
        repository = theEmployeeRepository;
    }

    @GetMapping("/emp")
    List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping("/emp")
    Employee createEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/emp/{id}")
    Employee findEmployeeById(@PathVariable Integer id) {
        return repository.findById(id).
                orElseThrow(() -> new EmployeeNotFoundException(id));
    }

}