package com.example.kafkacdctest.domain.student.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private Integer student_id;

    @Column
    private String student_name;

    @Column
    private String major;

    @Column
    private String professor;

    @Builder
    public Student(long id, Integer student_id, String student_name, String major, String professor) {
        this.id = id;
        this.student_id = student_id;
        this.student_name = student_name;
        this.major = major;
        this.professor = professor;
    }
}
