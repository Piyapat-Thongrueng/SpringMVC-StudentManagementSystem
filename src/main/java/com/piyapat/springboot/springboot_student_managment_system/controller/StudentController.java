package com.piyapat.springboot.springboot_student_managment_system.controller;

import com.piyapat.springboot.springboot_student_managment_system.dto.StudentDto;
import com.piyapat.springboot.springboot_student_managment_system.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // handler method to handle list students request
    @GetMapping({"/students"})
    public String listStudents(Model model){
        List<StudentDto> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }


}
