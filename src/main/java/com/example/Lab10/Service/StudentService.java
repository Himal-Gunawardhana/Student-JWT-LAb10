package com.example.Lab10.Service;

import java.util.List;

import com.example.Lab10.Model.Student;

public interface StudentService {
    Student createStudent(Student employee);
    Student getStudentById(long id);
    List<Student> getAllStudents();
    Student updateStudent(long id, Student employee);
    void deleteStudent(long id);
}
