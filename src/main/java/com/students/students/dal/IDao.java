package com.students.students.dal;

import java.util.List;

public interface IDao<T> {

    List<T> retrieveAll();
    T retrieveById(Long id);
    void insert(T obj);
    void update(T obj);
    T delete(Long id);
}
