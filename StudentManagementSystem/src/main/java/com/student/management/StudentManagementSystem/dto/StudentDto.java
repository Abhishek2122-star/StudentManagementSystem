package com.student.management.StudentManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private Long Id ;
    private String name ;
    private String email;

}
