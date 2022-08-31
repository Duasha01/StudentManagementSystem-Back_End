package com.example.studentmanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmanagementsystem.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
