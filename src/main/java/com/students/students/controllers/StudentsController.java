package com.students.students.controllers;

import com.students.students.services.IService;
import com.students.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {

    private final IService _studentsService;

    @Autowired
    public StudentsController(StudentService studentsService) {
        _studentsService = studentsService;
    }

    @GetMapping("/test")
    public List<String> test(){
        return _studentsService.test();
    }
}
