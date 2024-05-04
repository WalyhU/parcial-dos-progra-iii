package com.example.parcial.dao;

import com.example.parcial.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Long> {
}
