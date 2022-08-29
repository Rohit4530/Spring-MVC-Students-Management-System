package com.springboot.mvc.service;

import java.util.List;

import com.springboot.mvc.entity.Student;

public interface StudentService {
	public List<Student>getAllStudent();
	public Student addStudent(Student student);
	public Student getStudentById(Long id);
	public Student updateStudent(Student student);
	public void deleteStudentById(Long id);

}
