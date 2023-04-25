package com.example.kafkacdctest.domain.student.dto;

import lombok.Data;

@Data
public class StudentDTO {
    String student_name, major, professor;
    Integer student_id;
}
