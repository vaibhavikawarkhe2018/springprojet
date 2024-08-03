package com.shivam.rest_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.DTO.StudentDTO;
import com.shivam.rest_api.DTO.SubjectDTO;
import com.shivam.rest_api.entity.Student;
import com.shivam.rest_api.entity.Subject;
import com.shivam.rest_api.repo.StudentRepo;
import com.shivam.rest_api.repo.SubjectRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	SubjectRepo subjectRepo;
	
	@Override
	public String regStudent(StudentDTO dto) {
		String s;
		Student stud = new Student();
		stud.setStudentId(dto.getStudentId());
		stud.setStudentName(dto.getStudentName());
		stud.setStudentAddress(dto.getStudentAddress());
		List<Subject> subList = new ArrayList<>();
		for(SubjectDTO subject : dto.getSubject()) {
			Subject sub = new Subject();
			sub.setSubjectId(subject.getSubjectId());
			sub.setSubjectName(subject.getSubjectName());
			subList.add(sub);
		}
		stud.setSubject(subList);
		if(studentRepo.findById(stud.getStudentId()).isPresent()) {
			s="Student Id is already present";
		}else {
			studentRepo.save(stud);
			s="Student Registered Successfully";
		}
		return s;
	}



	@Override
	public Student getStudentById(Long id) {
		Student s = studentRepo.findById(id).get();
		return s;
	}



	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}



	@Override
	public List<Subject> getAllSubject() {
		return subjectRepo.findAll();
	}

}
