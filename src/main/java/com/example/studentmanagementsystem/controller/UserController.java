package com.example.studentmanagementsystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagementsystem.domain.User;
import com.example.studentmanagementsystem.repository.UserRepository;

@RestController
@CrossOrigin(origins="*")
public class UserController {
	@Autowired
	UserRepository userRepo;
	@GetMapping("/getuser/{email}")
	public User getUser(@PathVariable String email) {
		User user = userRepo.findByEmail(email);
		return user;
	}
	@GetMapping("/getuserId/{id}")
	public Optional<User> getUser(@PathVariable Integer id) {
		Optional<User> user = userRepo.findById(id);
		return user;
	}
}
