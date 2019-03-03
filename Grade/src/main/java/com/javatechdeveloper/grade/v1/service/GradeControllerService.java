package com.javatechdeveloper.grade.v1.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.javatechdeveloper.grade.v1.cargo.Staff;
import com.javatechdeveloper.grade.v1.cargo.Student;



public class GradeControllerService {

	@GetMapping
	public List<Student> getStudents(){
		return null;	
	}
	
	@GetMapping
	public List<Staff> getStaffs(){
		return null;	
	}
}
