package com.example.demo.repository;
import com.example.demo.models.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {
}
