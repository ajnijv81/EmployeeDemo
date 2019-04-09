package com.galvanize.employeedb.Services;

import com.galvanize.employeedb.Entities.Employee;
import com.galvanize.employeedb.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository repository;


    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }


    public Iterable<Employee> getAllEmployees() {
        return this.repository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return this.repository.save(employee);
    }
}
