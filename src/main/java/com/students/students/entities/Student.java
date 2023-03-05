package com.students.students.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String className;
}
