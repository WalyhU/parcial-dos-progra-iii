package com.example.parcial.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "subject_assignments")
public class SubjectAssignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentId;
    private Long subjectId;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}
