package com.Intern.InternPlus.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String companyName;

    private String salary;

    private String applyLink;

    private String title;

    private String location;

    private LocalDate datePosted;

    @ElementCollection
    private List<String> skills;



}
