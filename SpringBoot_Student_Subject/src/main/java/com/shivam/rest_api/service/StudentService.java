package com.shivam.rest_api.service;

import java.util.List;

import com.shivam.rest_api.DTO.StudentDTO;
import com.shivam.rest_api.entity.Student;
import com.shivam.rest_api.entity.Subject;

public interface StudentService {

	public String regStudent(StudentDTO dto);

	public Student getStudentById(Long id);

	public List<Student> getAllStudent();

	public List<Subject> getAllSubject();

}
