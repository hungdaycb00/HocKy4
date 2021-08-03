package com.example.restapinew.rest;


import com.example.restapinew.dao.EmployeeRepository;
import com.example.restapinew.entity.Employee;
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
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/emp/{id}")
    Employee findEmployeeById(@PathVariable Integer id) {
        return repository.findById(id).
                orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @DeleteMapping("/emp/{id}")
    void deleteCustomer(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @PutMapping("/emp/{id}")
    Employee replaceCustomer(@RequestBody Employee newCustomer, @PathVariable Integer id){

        return repository.findById(id)
                .map(customer -> {
                    customer.setFirstName(newCustomer.getFirstName());
                    customer.setLastName(newCustomer.getLastName());
                    customer.setEmail(newCustomer.getEmail());
                    return repository.save(customer);
                })
                .orElseGet(() -> {
                    newCustomer.setId(id);
                    return repository.save(newCustomer);
                });
    }
}