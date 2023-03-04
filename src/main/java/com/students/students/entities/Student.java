package com.students.students.entities;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    private String className;
}
