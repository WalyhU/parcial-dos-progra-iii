package com.example.parcial.dao;

import com.example.parcial.entities.SubjectAssignments;
import org.springframework.data.repository.CrudRepository;

public interface SubjectAssignmentsDao extends CrudRepository<SubjectAssignments, Long> {
    SubjectAssignments findBySubjectId(Long subjectId);
    SubjectAssignments findByStudentId(Long studentId);
}
