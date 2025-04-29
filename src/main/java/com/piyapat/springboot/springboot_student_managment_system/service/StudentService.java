package com.piyapat.springboot.springboot_student_managment_system.service;

import com.piyapat.springboot.springboot_student_managment_system.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();
}
