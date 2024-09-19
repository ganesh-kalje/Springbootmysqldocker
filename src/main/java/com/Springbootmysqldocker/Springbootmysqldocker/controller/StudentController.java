package com.Springbootmysqldocker.Springbootmysqldocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springbootmysqldocker.Springbootmysqldocker.entity.Student;
import com.Springbootmysqldocker.Springbootmysqldocker.repo.StudentRepo;



@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentRepo studentRepo;
	
	
	@GetMapping("/findAll")
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}
	
	@PostMapping("/insert")
	public Student insert(@RequestBody Student student) {
		return studentRepo.save(student);
	}
}
