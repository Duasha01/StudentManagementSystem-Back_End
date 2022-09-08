package com.example.studentmanagementsystem.controller;

import com.example.studentmanagementsystem.domain.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins="*")
    public class StudentController {

        @Autowired
        StudentRepository studentRepo;

        //Display details of all students
        @GetMapping("/list")
        public List<Student> displayDetails(){
            List<Student> studentList = (List<Student>) studentRepo.findAll();
            return studentList;
        }

        //Display details of a student using name
        @GetMapping("/findstudent/{id}")
        public Optional<Student> displayStudentDetails(@PathVariable Long id){
            Optional<Student> student = studentRepo.findById(id);
            return student;
        }

        //Add a student to the database
        @PostMapping("/create")
        public String addStudent(@RequestBody Student student){
            studentRepo.save(student);
            return student.getName()+" has been added succesfully!";
        }

        //Update details of a student
        @PutMapping("/update")
        public Optional<Student> updateStudent(@RequestBody Student student) {
            studentRepo.save(student);
            return studentRepo.findById(student.getId());
        }

        //Delete a student from the database
        @DeleteMapping("/delete/{id}")
        public List<Student> deleteStudent(@PathVariable Long id){
            studentRepo.deleteById(id);
            List<Student> studentList = (List<Student>) studentRepo.findAll();
            return studentList;
        }
        
        @GetMapping("/studentCount")
        public Long getStudentCount() {
        	return studentRepo.getStudentCount();
        }
        
        @GetMapping("/studentCountDegree/{degree}")
        public Long getStudentCountByDegree(@PathVariable String degree) {
        	return studentRepo.getStudentCountByDegree(degree);
        }
        
        @GetMapping("/studentCountGender/{gender}")
        public Long getStudentCountByGender(@PathVariable String gender) {
        	return studentRepo.getStudentCountByGender(gender);
        }
 
}
