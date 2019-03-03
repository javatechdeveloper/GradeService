package com.javatechdeveloper.grade.v1.service.endpoints;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechdeveloper.grade.v1.cargo.Staff;
import com.javatechdeveloper.grade.v1.cargo.Student;


@RestController
@RequestMapping(value="/grade", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
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