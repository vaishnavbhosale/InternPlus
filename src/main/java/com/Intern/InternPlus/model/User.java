package com.Intern.InternPlus.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String domain;


    @ElementCollection  //it’s just a list of simple values
    // (like strings) that belong to this user.
    private List<String> skills;

    private String createdAt; // Local date > String because postman 400

    private String phoneNumber; // integer > String because postman 400


}
