package com.piyapat.springboot.springboot_student_managment_system.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "Student first name must not be empty")
    private String firstName;
    @NotEmpty(message = "Student last name must not be empty")
    private String lastName;
    @NotEmpty(message = "Student email must not be empty")
    @Email
    private String email;

    // getter/setter methods
}
