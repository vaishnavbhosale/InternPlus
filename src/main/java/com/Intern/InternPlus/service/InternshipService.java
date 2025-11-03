package com.Intern.InternPlus.service;
import com.Intern.InternPlus.controller.InternshipController;
import com.Intern.InternPlus.model.Internship;
import com.Intern.InternPlus.repository.InternshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternshipService {

    private final InternshipRepository internshipRepository;

    public InternshipService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    public Internship addInternship(Internship internship){

        return internshipRepository.save(internship);
    }
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }


    public Optional<Internship> getInternshipById(Long id) {
        return internshipRepository.findById(id);
    }


    public void deleteInternship(Long id) {
        internshipRepository.deleteById(id);
    }
}
