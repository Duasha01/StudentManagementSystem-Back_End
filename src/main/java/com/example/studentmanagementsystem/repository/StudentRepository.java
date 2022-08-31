package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
 
}
