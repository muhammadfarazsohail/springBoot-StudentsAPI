package com.students.students.controllers;

import com.students.students.entities.Student;
import com.students.students.services.IService;
import com.students.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController implements IController<Student> {

    private final IService _studentsService;

    @Autowired
    public StudentsController(StudentService studentsService) {
        _studentsService = studentsService;
    }

    @GetMapping("/test")
    public List<String> test(){
        return _studentsService.test();
    }

    @GetMapping("/retrieveAll")
    @Override
    public ResponseEntity<List<Student>> retrieveAll() {
        return ResponseEntity.ok().body(_studentsService.retrieveAll());
    }

    @GetMapping("/retrieveById")
    @Override
    public ResponseEntity<Student> retrieveById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok().body( (Student) _studentsService.retrieveById(id));
    }

    @PostMapping("/insert")
    @Override
    public ResponseEntity<Student> insert(@RequestBody Student obj) {
        return ResponseEntity.ok().body( (Student) _studentsService.insert(obj));
    }

    @PutMapping("/update")
    @Override
    public ResponseEntity<Student> update(@RequestBody Student obj) {

        return ResponseEntity.ok().body((Student) _studentsService.insert(obj));
    }

    @DeleteMapping("/delete")
    @Override
    public HttpStatus delete(@PathVariable Long id) throws Exception {
         _studentsService.delete(id);
         return HttpStatus.OK;
    }
}
