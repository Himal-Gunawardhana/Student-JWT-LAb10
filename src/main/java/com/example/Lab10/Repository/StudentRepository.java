package com.example.Lab10.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Lab10.Model.Student;

public interface StudentRepository extends MongoRepository<Student, Long> {
    // You can define custom query methods here if needed
}
