package com.bc.spring_with_react.controller;

import com.bc.spring_with_react.domain.Student;
import com.bc.spring_with_react.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/students", method= RequestMethod.GET)
    public List<Student> findAll() { return studentService.findAll(); }

    @RequestMapping(value="/studentById/{id}", method= RequestMethod.GET)
    public List<Student> findStudentById(@PathVariable Integer id) { return studentService.findStudentById(id); }

}
