package com.example.parcial.data.services;

import com.example.parcial.entities.SubjectAssignments;

import java.util.List;

public interface SubjectAssignmentsService {
    public List<SubjectAssignments> findAll();
    public SubjectAssignments findById(Long id);
    public SubjectAssignments findBySubjectId(Long subjectId);
    public SubjectAssignments findByStudentId(Long studentId);
    public void createSubjectAssignments(SubjectAssignments subjectAssignments);
    public void updateSubjectAssignments(Long id, SubjectAssignments subjectAssignments);
    public void deleteSubjectAssignments(Long id);
}
