package com.springboot.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.mvc.entity.Student;
import com.springboot.mvc.repo.StudentRepo;

@SpringBootApplication
public class SpringBootMvcApplication implements CommandLineRunner {
	@Autowired
	private StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student(1l, "rohit", "gunjal",
		 * "rohitgunjal13@gmail.com"); repo.save(student1); Student student2 = new
		 * Student(2l, "manish","wagh", "mwagh@gmail.com"); repo.save(student2); Student
		 * student3 = new Student(3l, "karan", "warma", "warmak324@gmail.com");
		 * repo.save(student3);
		 */	}

}
