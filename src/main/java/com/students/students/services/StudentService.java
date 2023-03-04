package com.students.students.services;

import com.students.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IService<Student>{
    @Override
    public List<String> test() {
        return List.of("Hello","from","service");
    }

    @Override
    public List<Student> retrieveAll() {
        return null;
    }

    @Override
    public Student retrieveById(Long id) {
        return null;
    }

    @Override
    public void insert(Student obj) {

    }

    @Override
    public void update(Student obj) {

    }

    @Override
    public Student delete(Long id) {
        return null;
    }
}
