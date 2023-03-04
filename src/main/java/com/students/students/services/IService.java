package com.students.students.services;

import java.util.List;

public interface IService<T> {

    List<String> test();
    List<T> retrieveAll();
    T retrieveById(Long id);
    void insert(T obj);
    void update(T obj);
    T delete(Long id);
}
