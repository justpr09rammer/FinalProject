package com.example.finalproject.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sureName;
    private String email;
    private String education;
    private String description;
    private String phoneNumber;
    private String location;
    private String trying;
    @OneToMany(mappedBy = "teacher")
    private List<Course> courses = new ArrayList<>();

    @ElementCollection
    private List<String> reviews = new ArrayList<>();
}
