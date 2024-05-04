package com.example.parcial.data.services;

import com.example.parcial.entities.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student findById(Long id);
    public void createStudent(Student student);
    public void updateStudent(Long id, Student student);
    public void deleteStudent(Long id);
}
