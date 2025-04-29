package com.piyapat.springboot.springboot_student_managment_system.mapper;

import com.piyapat.springboot.springboot_student_managment_system.dto.StudentDto;
import com.piyapat.springboot.springboot_student_managment_system.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
        return student;
    }
}
