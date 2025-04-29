package com.piyapat.springboot.springboot_student_managment_system.service;

import com.piyapat.springboot.springboot_student_managment_system.dto.StudentDto;
import jakarta.validation.Valid;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    void createStudent(@Valid StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(@Valid StudentDto studentDto);
}
