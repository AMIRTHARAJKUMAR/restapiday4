package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService
@RestController
public class ApiController
{
	@Autowired
	ApiService studentservice;
	@PostMapping("addstudent")
	
	 public Student add(@RequestBody Student ss) {
		 return studentservice.addinfo(ss);
	 }

	@GetMapping("showdetails")
	public List<Student> show(){
		return studentservice.showinfo();
		
	}
	@PutMapping("updateDetails")
	public Student updateValue(@RequestBody Student ss) {
		return studentservice.update(ss);
	}
	@DeleteMapping("deleteDetails")
	public String deleteDetail(@RequestBody Student ss) {
		studentservice.delete(ss);
		return "Deleted Successfully";
	}

}