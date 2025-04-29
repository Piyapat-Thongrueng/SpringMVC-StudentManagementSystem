package com.piyapat.springboot.springboot_student_managment_system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    // getter/setter methods
}
