package com.example.Lab10.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lab10.Model.Student;
import com.example.Lab10.Repository.StudentRepository;
import com.example.Lab10.Service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository employeeRepository;

    @Override
    public Student createStudent(Student employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Student getStudentById(long id) {
        Optional<Student> employee = employeeRepository.findById(id);
        return employee.orElse(null); // Return null or throw an exception if not found
    }

    @Override
    public List<Student> getAllStudents() {
        return employeeRepository.findAll();
    }

    @Override
    public Student updateStudent(long id, Student employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null; // Return null or throw an exception if not found
    }

    @Override
    public void deleteStudent(long id) {
        employeeRepository.deleteById(id);
    }
}
