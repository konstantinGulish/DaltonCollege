package com.example.demo.repository;

import com.example.demo.models.AppUser;
import com.example.demo.models.OurClass;
import com.example.demo.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findStudentByUserEquals(AppUser user);
}
