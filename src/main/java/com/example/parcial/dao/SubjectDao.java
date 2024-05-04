package com.example.parcial.dao;

import com.example.parcial.entities.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectDao extends CrudRepository<Subject, Long> {
}
