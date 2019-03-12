package com.bc.spring_with_react.service;

import com.bc.spring_with_react.domain.Student;
import com.bc.spring_with_react.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public List<Student> findAll() { return studentRepo.findAll(); }

    public List<Student> findStudentById(Integer id) { return studentRepo.findStudentById(id); }

}
