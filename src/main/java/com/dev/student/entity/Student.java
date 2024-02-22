package com.dev.student.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;

    @NotBlank(message = "First Name is Mandatory")
    private String firstname;

    @NotBlank(message="Last Name is Mandatory")
    private String Lastname;

    @Email
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@uga\\.edu$", message = "Please provide a valid @uga.edu email address")
    private String email;

    @NotBlank
    private String phn;

    @NotBlank
    private String password;



}
