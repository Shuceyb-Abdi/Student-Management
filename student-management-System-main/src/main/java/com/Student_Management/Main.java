package com.Student_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
    @Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(1,"Salah", "Ahmed" ,"salah@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student(2,"Mohamed", "Hassan" ,"mohamed@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student(3,"Nasro", "Mohamed" ,"nasro@gmail.com");
		studentRepository.save(student3);
		Student student4 = new Student(4,"Shuceyb", "Abdi" ,"shuceyb@gmail.com");
		studentRepository.save(student4);


	}
}
