package com.example.practicetestpapper.dao;

import com.example.practicetestpapper.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    public List<Employee> findAllByNameOrderByNameAsc();

}