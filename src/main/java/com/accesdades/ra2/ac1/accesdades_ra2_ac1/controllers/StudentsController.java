package com.accesdades.ra2.ac1.accesdades_ra2_ac1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.accesdades.ra2.ac1.accesdades_ra2_ac1.models.Student;
import com.accesdades.ra2.ac1.accesdades_ra2_ac1.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentsController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/student/batch")
    public String postStudentsBatch() {
        int changes = studentRepository.save();
        return "Number of students inserted: " + changes;
    }
}
