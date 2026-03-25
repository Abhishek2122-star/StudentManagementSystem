package com.student.management.StudentManagementSystem.controller;

import com.student.management.StudentManagementSystem.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(43L, "abhishek" , "abhiseheklad963@gmail.com");
    }
//    @GetMapping("/student/{id}")
//    public StudentDto getStudent(){
//        return new StudentDto(43L, "abhishek" , "abhiseheklad963@gmail.com");
//    }


}
