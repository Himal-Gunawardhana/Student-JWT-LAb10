package com.example.CRUD_BE_MDB.Service;

import com.example.CRUD_BE_MDB.Model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(long id, Employee employee);
    void deleteEmployee(long id);
}
