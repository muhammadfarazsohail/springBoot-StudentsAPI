package com.students.students.services;

import java.util.List;

public interface IService<T> {

    List<String> test();
    List<T> retrieveAll();
    T retrieveById(Long id) throws Exception;
    T insert(T obj);
    T update(T obj) throws Exception;
    void delete(Long id) throws Exception;
}
