package com.example.parcial.data.services;

import com.example.parcial.dao.SubjectAssignmentsDao;
import com.example.parcial.entities.SubjectAssignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectAssignmentsServiceImpl implements SubjectAssignmentsService {

    @Autowired
    private SubjectAssignmentsDao subjectAssignmentsDao;

    @Override
    public List<SubjectAssignments> findAll() {
        return (List<SubjectAssignments>) subjectAssignmentsDao.findAll();
    }

    @Override
    public SubjectAssignments findById(Long id) {
        return subjectAssignmentsDao.findById(id).orElse(null);
    }

    @Override
    public SubjectAssignments findBySubjectId(Long subjectId) {
        return subjectAssignmentsDao.findBySubjectId(subjectId);
    }

    @Override
    public SubjectAssignments findByStudentId(Long studentId) {
        return subjectAssignmentsDao.findByStudentId(studentId);
    }

    @Override
    public void createSubjectAssignments(SubjectAssignments subjectAssignments) {
        subjectAssignmentsDao.save(subjectAssignments);
    }

    @Override
    public void updateSubjectAssignments(Long id, SubjectAssignments subjectAssignments) {
        if (subjectAssignmentsDao.existsById(id)) {
            subjectAssignments.setId(id);
            subjectAssignmentsDao.save(subjectAssignments);
        }
    }

    @Override
    public void deleteSubjectAssignments(Long id) {
        if (subjectAssignmentsDao.existsById(id)) {
            subjectAssignmentsDao.deleteById(id);
        }
    }
}
