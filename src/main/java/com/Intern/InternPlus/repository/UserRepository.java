package com.Intern.InternPlus.repository;

import com.Intern.InternPlus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
