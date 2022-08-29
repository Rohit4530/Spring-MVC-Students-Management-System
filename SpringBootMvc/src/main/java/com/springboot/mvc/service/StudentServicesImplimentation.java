package com.springboot.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.mvc.entity.Student;
import com.springboot.mvc.repo.StudentRepo;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class StudentServicesImplimentation implements StudentService{
	private final StudentRepo repo;
	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	@Override
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		Student student=repo.getStudentById(id);
		return student;
	}
	@Override
	public Student updateStudent(Student student) {	
		return repo.save(student);
	}
	@Override
	public void deleteStudentById(Long id) {
		 repo.deleteById(id);	
	}

}
