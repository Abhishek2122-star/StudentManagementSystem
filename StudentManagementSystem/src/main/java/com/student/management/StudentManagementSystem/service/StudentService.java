package com.student.management.StudentManagementSystem.service;

import com.student.management.StudentManagementSystem.dto.StudentDto;
import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}