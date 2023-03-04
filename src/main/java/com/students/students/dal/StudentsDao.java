package com.students.students.dal;

import com.students.students.entities.Student;

import java.util.List;

public class StudentsDao implements IDao<Student>{
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
