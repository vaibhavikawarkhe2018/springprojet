package com.shivam.rest_api.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.DTO.StudentDTO;
import com.shivam.rest_api.entity.Student;
import com.shivam.rest_api.entity.Subject;
import com.shivam.rest_api.service.StudentService;

@RestController
public class MVC_Controllor {

	@Autowired
	StudentService student;
	
	@PostMapping("/createStudent")
	public String createStudent(@RequestBody StudentDTO dto) {
		return student.regStudent(dto);
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return student.getStudentById(id);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudent(){
		return student.getAllStudent();
	}
	
	@GetMapping("/getAllSubject")
	public List<Subject> getAllSubject(){
		return student.getAllSubject();
	}
}
