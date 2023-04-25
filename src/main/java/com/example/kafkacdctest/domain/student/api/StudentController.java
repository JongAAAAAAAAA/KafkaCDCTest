package com.example.kafkacdctest.domain.student.api;

import com.example.kafkacdctest.domain.student.dao.StudentRepository;
import com.example.kafkacdctest.domain.student.dto.StudentDTO;
import com.example.kafkacdctest.domain.student.model.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class StudentController {
    private StudentRepository studentRepository;

    @PostMapping("/register/source")
    Long studentRegister(@RequestBody StudentDTO studentDTO){
        log.info("Source Data 입력, id : {}, name : {}, major : {}, professor : {} ",
                studentDTO.getStudent_id(), studentDTO.getStudent_name(), studentDTO.getMajor(), studentDTO.getProfessor());

        Student student = Student.builder()
                .student_id(studentDTO.getStudent_id())
                .student_name(studentDTO.getStudent_name())
                .major(studentDTO.getMajor())
                .professor(studentDTO.getProfessor())
                .build();

        Student save = studentRepository.save(student);

        return save.getId();
    }
}
