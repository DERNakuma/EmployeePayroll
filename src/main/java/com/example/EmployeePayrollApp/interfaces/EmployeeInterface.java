package com.example.EmployeePayrollApp.interfaces;

import com.example.EmployeePayrollApp.model.Employee;

import java.util.List;

public interface EmployeeInterface {
    List<Employee> getAllEmployees();
    Employee addEmployee(Employee employee);
    Employee getEmployeeId(Long id);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
