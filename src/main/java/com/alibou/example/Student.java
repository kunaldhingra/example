package com.alibou.example;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "student")
public class Student {

    @Id
    private String id;
    private String firstname;
    private String lastname;

    @Indexed(unique = true, background = true)
    private String email;
    private int age;

   /* @OneToOne(
            mappedBy = "student",
            cascade = CascadeType.ALL
    )*/
  /*  @DBRef
    private StudentProfile studentProfile;*/


   /* @ManyToOne
    @JoinColumn(
            name = "school_id"
    )
    @JsonBackReference*/
    @DBRef
    @JsonBackReference
    private School school;

    public Student() {
    }

    public Student(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id =id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* public StudentProfile getStudentProfile() {
        return studentProfile;
    }*/

  /*  public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }*/

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }


}
