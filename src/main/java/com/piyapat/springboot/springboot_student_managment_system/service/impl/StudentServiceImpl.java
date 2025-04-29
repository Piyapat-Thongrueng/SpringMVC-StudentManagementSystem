package com.piyapat.springboot.springboot_student_managment_system.service.impl;

import com.piyapat.springboot.springboot_student_managment_system.dto.StudentDto;
import com.piyapat.springboot.springboot_student_managment_system.entity.Student;
import com.piyapat.springboot.springboot_student_managment_system.mapper.StudentMapper;
import com.piyapat.springboot.springboot_student_managment_system.repository.StudentRepository;
import com.piyapat.springboot.springboot_student_managment_system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos = students.stream()
                .map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
        return studentDtos;
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        studentRepository.save(student);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        StudentDto studentDto = StudentMapper.mapToStudentDto(student);
        return studentDto;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.mapToStudent(studentDto));
    }
}
