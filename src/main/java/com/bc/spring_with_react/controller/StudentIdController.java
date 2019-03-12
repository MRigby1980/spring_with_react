package com.bc.spring_with_react.controller;

import com.bc.spring_with_react.domain.StudentID;
import com.bc.spring_with_react.repository.StudentIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentIdController {

    @Autowired
    private StudentIdRepository studentIdRepo;

    @RequestMapping(value="/studentIds", method= RequestMethod.GET)
    public List<StudentID> findAll() { return studentIdRepo.findAll(); }


}
