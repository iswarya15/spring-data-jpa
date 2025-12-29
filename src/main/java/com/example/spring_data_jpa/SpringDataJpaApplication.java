package com.example.spring_data_jpa;

import com.example.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollNo(1);
        s1.setName("Harry");
        s1.setMarks(100);

        s2.setRollNo(2);
        s2.setName("John");
        s2.setMarks(89);

        s3.setRollNo(3);
        s3.setName("Steve");
        s3.setMarks(77);


        System.out.println(repo.findByMarksGreaterThan(90));
	}

}
