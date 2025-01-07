package com.example.Lab10.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.example.Lab10.Model.Student;
import com.example.Lab10.Service.StudentService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService employeeService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student employee) {
        Student createdStudent = employeeService.createStudent(employee);
        return ResponseEntity.ok(createdStudent);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id) {
        Student employee = employeeService.getStudentById(id);
        return employee != null ? ResponseEntity.ok(employee) : ResponseEntity.notFound().build();
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> employees = employeeService.getAllStudents();
        return ResponseEntity.ok(employees);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student employee) {
        Student updatedStudent = employeeService.updateStudent(id, employee);
        return updatedStudent != null ? ResponseEntity.ok(updatedStudent) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
        employeeService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}

