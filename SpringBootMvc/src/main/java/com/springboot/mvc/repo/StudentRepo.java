package com.springboot.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mvc.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	Student getStudentById(Long id);

	Student deleteStudentById(Long id);

}
