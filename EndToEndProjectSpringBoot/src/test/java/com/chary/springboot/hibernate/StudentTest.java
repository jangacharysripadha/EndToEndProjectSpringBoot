package com.chary.springboot.hibernate;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chary.springboot.hibernate.dao.StudentRepo;
import com.chary.springboot.hibernate.entities.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
	@Autowired
	StudentRepo studentRepo;
    
	@Test
	public void testCreateStudent()
	{
		Student s1=new Student();
		s1.setName("chary");
		s1.setCourse("java");
		s1.setFees(30d);
		s1.setAddress("hyd");
		studentRepo.save(s1);
		
	}
}
