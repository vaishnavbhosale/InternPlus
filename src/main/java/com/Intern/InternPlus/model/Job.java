package com.Intern.InternPlus.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String jobTitle;

    private String applyLink;

    private String domain;

    private String salary;

    @ElementCollection
    private List<String> skills;

    private LocalDate datePosted;


//    public Job(){
//
//    }
//
//    public Job(Long id , String companyName , String jobTitle , String applyLink , String domain ,String salary , String skills , LocalDate datePosted ){
//        this.applyLink = applyLink;
//        this.companyName = companyName;
//        this.jobTitle = jobTitle;
//        this.id = id;
//        this.datePosted = datePosted;
//        this.domain = domain;
//        this.salary = salary;
//        this.skills = skills;
//    }
//    public Long getId() {
//     return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCompanyName(){
//     return companyName;
//    }
//    public void setCompanyName(String companyName) {
//     this.companyName = companyName;
//    }
//
//    public String getJobTitle() {
//    return jobTitle;
//    }
//    public void setJobTitle(String jobTitle) {
//     this.jobTitle = jobTitle;
//    }
//
//    public String getApplyLink() {
//     return applyLink;
//    }
//    public void setApplyLink(String applyLink){
//     this.applyLink = applyLink;
//    }
//
//    public String getDomain() {
//     return domain;
//    }
//    public void setDomain(String domain) {
//        this.domain = domain;
//    }
//
//    public String getSalary() {
//     return salary;
//    }
//
//    public void setSalary(String salary){
//     this.salary = salary;
//    }
//
//    public String getSkills(){
//     return skills;
//    }
//
//    public void setSkills(String skills){
//     this.skills = skills;
//    }
//
//    public LocalDate getDatePosted(){
//     return datePosted;
//    }
//    public void setDatePosted(LocalDate datePosted) {
//     this.datePosted = datePosted;
//    }
// no use of this after adding @Data
}
