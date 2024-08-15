package com.alibou.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private final SchoolRepository schoolRepository;


    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @PostMapping("/school")
    public School createSchool(@RequestBody School school){
        return schoolRepository.save(school);

    }
    @GetMapping("/allschool")
    public List<School> getSchool(){
        List<School> schools = schoolRepository.findAll();
        for (School school : schools) {
            System.out.println("School: " + school.getName());
            if (school.getStudents() != null) {
                for (Student student : school.getStudents()) {
                    System.out.println("Student: " + student.getFirstname() + " " + student.getLastname());
                }
            }
        }
        return schools;
    }
}