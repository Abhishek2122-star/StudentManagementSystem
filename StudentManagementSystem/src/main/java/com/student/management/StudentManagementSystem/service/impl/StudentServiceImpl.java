package com.student.management.StudentManagementSystem.service.impl;

import com.student.management.StudentManagementSystem.dto.StudentDto;
import com.student.management.StudentManagementSystem.entity.Student;
import com.student.management.StudentManagementSystem.repository.StudentRepository;
import com.student.management.StudentManagementSystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        // 1. Use the instance variable 'studentRepository' (lowercase)
        List<Student> students = studentRepository.findAll();

        // 2. Map and RETURN the list (don't forget the return keyword!)
        return students.stream()
                .map(student -> new StudentDto(
                        student.getId(),
                        student.getName(),
                        student.getEmail() // 3. Ensure this matches your DTO constructor
                ))
                .toList();
    }
}