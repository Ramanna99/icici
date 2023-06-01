package com.bank.icici.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.icici.bean.Student;

@RestController
@ControllerAdvice
@RequestMapping(path="/student")
public class StudentController {
	
	@PostMapping(path="/create",consumes="application/json")
	public ResponseEntity<Void> addStd(@RequestBody Student std)
	{
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping(path="/get",produces="application/json")
	public ResponseEntity<Student> get()
	{
		Student std=new Student();
		std.setSid(101);
		std.setSname("Swarna");
		std.setAge(23);
		std.setCollege("SV Degree College");
		std.setAddress("Ananatapur");
		
		return  new ResponseEntity<Student>(std,HttpStatus.OK);
		
	}
	@GetMapping(path="/getall",produces="application/json")
	public ResponseEntity<List<Student>> getAll()
	{
		
		List<Student> stdlist=new ArrayList<>();
		Student std=new Student();
		std.setSid(101);
		std.setSname("Swarna");
		std.setAge(23);
		std.setCollege("SV Degree College");
		std.setAddress("Ananatapur");
		
		Student std1=new Student();
		std1.setSid(102);
		std1.setSname("Haritha");
		std1.setAge(24);
		std1.setCollege("SV Degree College");
		std1.setAddress("Guntakal");
		
		Student std2=new Student();
		std2.setSid(103);
		std2.setSname("Vani");
		std2.setAge(25);
		std2.setCollege("SV Degree College");
		std2.setAddress("Guntakal");
		
		stdlist.add(std);
		stdlist.add(std1);
		stdlist.add(std2);
		
		
		return  new ResponseEntity<List<Student>>(stdlist,HttpStatus.OK);
		
	}
	
	
	

}
