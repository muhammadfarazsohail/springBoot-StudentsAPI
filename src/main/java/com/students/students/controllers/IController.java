package com.students.students.controllers;

import java.util.List;

public interface IController<T> {

    List<T> retrieveAll();
    T retrieveById(Long id);
    void insert(T obj);
    void update(T obj);
    T delete(Long id);
}
