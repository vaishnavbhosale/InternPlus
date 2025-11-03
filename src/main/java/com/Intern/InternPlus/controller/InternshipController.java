package com.Intern.InternPlus.controller;

import com.Intern.InternPlus.service.InternshipService;

import com.Intern.InternPlus.model.Internship;
import com.Intern.InternPlus.repository.InternshipRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.Optional;

@RestController
@RequestMapping("/api/internships")
public class InternshipController {

    private final InternshipService internshipService;

    // Constructor injection
    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }


    @PostMapping
    public Internship addInternship(@RequestBody Internship internship) {
        return internshipService.addInternship(internship);
    }


    @GetMapping
    public List<Internship> getAllInternships() {
        return internshipService.getAllInternships();
    }


    @GetMapping("/{id}")
    public Optional<Internship> getInternshipById(@PathVariable Long id) {
        return internshipService.getInternshipById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteInternship(@PathVariable Long id) {
        internshipService.deleteInternship(id);
    }
}



