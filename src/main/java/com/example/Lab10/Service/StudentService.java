package com.example.Lab10.Service;

import java.util.List;

import com.example.Lab10.Model.Student;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(long id);
    List<Student> getAllStudents();
    Student updateStudent(long id, Student student);
    void deleteStudent(long id);
}
