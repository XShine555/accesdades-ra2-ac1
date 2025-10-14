package com.accesdades.ra2.ac1.accesdades_ra2_ac1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.accesdades.ra2.ac1.accesdades_ra2_ac1.models.Student;

@RestController
@RequestMapping("/api")
public class StudentsController {
    @GetMapping("/students")
    public String getStudents() {
        return "API Get Students";
    }

    @PostMapping("/batch")
    public String postStudentsBatch(@RequestBody List<Student> students) {
        return "API Post Batch Students";
    }
}
