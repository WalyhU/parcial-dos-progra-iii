package com.example.parcial.data.controller;

import com.example.parcial.data.services.SubjectAssignmentsService;
import com.example.parcial.entities.SubjectAssignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject_assignment")
public class SubjectAssignmentsController {

    @Autowired
    private SubjectAssignmentsService subjectAssignmentsService;

    @GetMapping
    public List<SubjectAssignments> getSubjectAssignments() {
        return subjectAssignmentsService.findAll();
    }

    @GetMapping("/{param}")
    public SubjectAssignments getSubjectAssignmentsBy(@PathVariable Long param) {
        try {
            return subjectAssignmentsService.findBySubjectId(param);
        } catch (Exception e) {
            return subjectAssignmentsService.findByStudentId(param);
        }
    }

    @PostMapping
    public void createSubjectAssignments(@RequestBody SubjectAssignments subjectAssignments) {
        subjectAssignmentsService.createSubjectAssignments(subjectAssignments);
    }

    @PutMapping("/{id}")
    public void updateSubjectAssignments(@PathVariable Long id, @RequestBody SubjectAssignments subjectAssignments) {
        subjectAssignmentsService.updateSubjectAssignments(id, subjectAssignments);
    }

    @DeleteMapping("/{id}")
    public void deleteSubjectAssignments(@PathVariable Long id) {
        subjectAssignmentsService.deleteSubjectAssignments(id);
    }
}
