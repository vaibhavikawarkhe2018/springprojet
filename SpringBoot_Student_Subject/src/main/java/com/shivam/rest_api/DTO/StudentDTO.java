package com.shivam.rest_api.DTO;

import java.util.List;

public class StudentDTO {
	
	private Long studentId;
	private String studentName;
	private String studentAddress;
	private List<SubjectDTO> subject;
	
	public StudentDTO(Long studentId, String studentName, String studentAddress, List<SubjectDTO> subject) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.subject = subject;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<SubjectDTO> getSubject() {
		return subject;
	}

	public void setSubject(List<SubjectDTO> subject) {
		this.subject = subject;
	}
	
	
}
