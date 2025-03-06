package com.example.EmployeePayrollApp.services;

import com.example.EmployeePayrollApp.model.Employee;
import com.example.EmployeePayrollApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);

    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Empolyee not found"));
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();

    }

    public Employee updateEmployee(Long id, Employee employee){
        Employee found=getEmployeeById(id);
        found.setName(employee.getName());
        found.setDepartment(employee.getDepartment());
        found.setSalary(employee.getSalary());
        return employeeRepository.save(found);

    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
