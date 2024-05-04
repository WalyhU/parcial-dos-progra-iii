package com.example.parcial.data.services;

import com.example.parcial.entities.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void createStudent(Student student) {

    }

    @Override
    public void updateStudent(Long id, Student student) {

    }

    @Override
    public void deleteStudent(Long id) {

    }
}
