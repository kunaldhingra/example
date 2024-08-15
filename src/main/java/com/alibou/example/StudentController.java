package com.alibou.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    public Student post(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/getallstudents")
    public List<Student> getstudents(Student student){
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") String id) {
        return studentRepository.findById(id);
    }

    @DeleteMapping("/clearstudents")
    public void clearStudents() {
       studentRepository.deleteAll();
    }

    @GetMapping("/getbyname/{firstname}")
    public List<Student> getbyName(@PathVariable("firstname") String firstname){
        return studentRepository.findAllByFirstnameContaining(firstname);
    }

    @DeleteMapping("/deletestudents/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void  deleteStudentById(@PathVariable("id") String id) {
        studentRepository.deleteById(id);
    }


}
