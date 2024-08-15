package com.alibou.example;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findAllByFirstnameContaining(String p);

}