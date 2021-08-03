package com.example.restapinew.service;

import com.example.restapinew.entity.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImp implements EmployeeService{
    private EmployeeService repository;


    public EmployeeServiceImp(EmployeeService repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = Optional.ofNullable(repository.findById(theId));

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        repository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        repository.deleteById(theId);
    }

    @Override
    public List<Employee> searchBy(String theName) {
        List<Employee> results = null;

        if (theName != null && (theName.trim().length() > 0)) {
            results = repository.searchBy(theName);
        }
        else {
            results = findAll();
        }

        return results;
    }
}
