package com.students.students.services;

import com.students.students.entities.Student;
import com.students.students.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService implements IService<Student>{

    private final StudentRepository _studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        _studentRepository = studentRepository;
    }

    @Override
    public List<String> test() {
        return List.of("Hello","from","service");
    }

    @Override
    public List<Student> retrieveAll() {

        return _studentRepository.findAll();
    }

    @Override
    public Student retrieveById(Long id) throws Exception {
        Optional<Student> checkStudent= _studentRepository.findById(id);
        if(checkStudent.isPresent()){
            return checkStudent.get();
        }
        else{
            throw new Exception("Resource not found by id:"+id);
        }
    }

    @Override
    public Student insert(Student obj) {
        return _studentRepository.save(obj);
    }

    @Override
    public Student update(Student obj) throws Exception {

        Optional<Student> checkStudent= _studentRepository.findById(obj.getId());
        if(checkStudent.isPresent()){
            Student studentUpdate= checkStudent.get();
            studentUpdate.setId(obj.getId());
            studentUpdate.setDob(obj.getDob());
            studentUpdate.setEmail(obj.getEmail());
            studentUpdate.setFirstName(obj.getFirstName());
            studentUpdate.setLastName(obj.getLastName());
            studentUpdate.setClassName(obj.getClassName());
            _studentRepository.save(studentUpdate);
            return studentUpdate;
        }
        else{
            throw new Exception("Resource not found");
        }
    }

    @Override
    public void delete(Long id) throws Exception {

        Optional<Student> checkStudent= _studentRepository.findById(id);
        if(checkStudent.isPresent()){
            _studentRepository.delete(checkStudent.get());
        }
        else{
            throw new Exception("Resource not found by id:"+id);
        }


    }
}
