package com.qspider.Student_springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qspider.Student_springboot.dto.Student;
import com.qspider.Student_springboot.repository.StudentRepository;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository sr;
	
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student s)
	{
		sr.save(s);
		return "data saved successfully";
	}
	
	@PatchMapping("/updateStudent")
	public String updateStudent(@RequestParam int stud_id , @RequestParam String stud_email)
	{
		Optional<Student> stud=sr.findById(stud_id);
		
		if(stud.isPresent())
		{
			Student s=stud.get();
			s.setStud_email(stud_email);
			sr.save(s);
		}
		return null;
	}
	
    @GetMapping("/getStudent")
	public Student fetchStudent(@RequestParam int stud_id)
	{
		Student s=sr.findById(stud_id).get();
		return s;
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent()
	{
		List <Student> l=sr.findAll();
		return l;
	}
	
	@DeleteMapping("/deleteStudent")
	public  String deleteStudent(@RequestParam int stud_id)
	{
		  Optional<Student> o =sr.findById(stud_id);
		  if(o.isPresent())
		  {
			  sr.deleteById(stud_id);
			  return "data deleted successfully";
		  }
		  return null;
   }

}
