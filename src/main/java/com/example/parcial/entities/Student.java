package com.example.parcial.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}
