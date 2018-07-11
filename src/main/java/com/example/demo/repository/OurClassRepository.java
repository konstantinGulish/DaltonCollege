package com.example.demo.repository;


import com.example.demo.models.OurClass;
import com.example.demo.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface OurClassRepository extends CrudRepository<OurClass, Long> {
Iterable<OurClass> findAllByStudentsIsIn(Student student);
}
