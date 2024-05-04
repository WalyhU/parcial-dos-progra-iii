package com.example.parcial.data.services;

import com.example.parcial.dao.StudentDao;
import com.example.parcial.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> findAll() {
        return (List<Student>) studentDao.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentDao.findById(id).orElse(null);
    }

    @Override
    public void createStudent(Student student) {
        studentDao.save(student);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        if (studentDao.existsById(id)) {
            student.setId(id);
            studentDao.save(student);
        }
    }

    @Override
    public void deleteStudent(Long id) {
        if (studentDao.existsById(id)) {
            studentDao.deleteById(id);
        }
    }
}
