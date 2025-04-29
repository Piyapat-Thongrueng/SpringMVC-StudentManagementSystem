package com.piyapat.springboot.springboot_student_managment_system.repository;

import com.piyapat.springboot.springboot_student_managment_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
