package com.students.students.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IController<T> {

    ResponseEntity<List<T>> retrieveAll();
    ResponseEntity<T> retrieveById(Long id) throws Exception;
    ResponseEntity<T> insert(T obj);
    ResponseEntity<T> update(T obj) throws Exception;
    HttpStatus delete(Long id) throws Exception;
}
