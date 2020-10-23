package com.somani.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.somani.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	@PostConstruct
	public void loadData() {
	
		theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Vipul","Somani"));
		theStudents.add(new Student("Yash","Maheshwari"));
		theStudents.add(new Student("Amit","Somani"));
		
	}
	
	//definr endpointfor /students
	@GetMapping("/students")
	public List<Student> getStudents(){
		return theStudents;
	}
	
	//define endpoint for "/student/{studentId}"
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		//just index from actual list
		if((studentId>=theStudents.size()) || (studentId<0)) {
			throw new StudentNotFoundException("Student id not found- "+ studentId);
		}
		
		return theStudents.get(studentId);
	}
	
	
}
