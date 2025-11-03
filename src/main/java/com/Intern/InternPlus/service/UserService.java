package com.Intern.InternPlus.service;

import com.Intern.InternPlus.model.User;
import com.Intern.InternPlus.repository.InternshipRepository;
import com.Intern.InternPlus.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository UserRepository) {
        this.userRepository = UserRepository;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public void  deleteUser(Long id){
        userRepository.deleteById(id);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


}
