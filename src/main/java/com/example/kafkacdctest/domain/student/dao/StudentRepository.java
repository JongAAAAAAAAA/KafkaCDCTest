package com.example.kafkacdctest.domain.student.dao;

import com.example.kafkacdctest.domain.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
