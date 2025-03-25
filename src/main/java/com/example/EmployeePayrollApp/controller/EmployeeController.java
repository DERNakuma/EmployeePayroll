package com.example.EmployeePayrollApp.controller;

import com.example.EmployeePayrollApp.model.Employee;
import com.example.EmployeePayrollApp.dto.EmployeeDTO;
import com.example.EmployeePayrollApp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    EmployeeDTO empDTO;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody EmployeeDTO empDTO){
        return employeeService.addEmployee(empDTO);
    }

    @GetMapping("/get")
    private List<Employee> getallEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return  employeeService.getEmployeeById(id);

    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO empDTO){
        return employeeService.updateEmployee(id,empDTO);
    }

    @DeleteMapping("/delete/{id}")
    public  void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

}
