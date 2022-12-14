package com.example.studentmanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmanagementsystem.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
}
