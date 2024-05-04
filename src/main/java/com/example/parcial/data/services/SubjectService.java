package com.example.parcial.data.services;

import com.example.parcial.entities.Subject;

import java.util.List;

public interface SubjectService {
    public List<Subject> findAll();
    public Subject findById(Long id);
    public void createSubject(Subject subject);
    public void updateSubject(Long id, Subject subject);
    public void deleteSubject(Long id);
}
