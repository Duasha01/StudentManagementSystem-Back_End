package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
	
	@Query("SELECT count(s) from students s")
	public Long getStudentCount();

	@Query("SELECT count(s) from students s where s.degree = ?1")
	public Long getStudentCountByDegree(String degree);
	 
	@Query("SELECT count(s) from students s where s.gender = ?1")
	public Long getStudentCountByGender(String gender);
}
