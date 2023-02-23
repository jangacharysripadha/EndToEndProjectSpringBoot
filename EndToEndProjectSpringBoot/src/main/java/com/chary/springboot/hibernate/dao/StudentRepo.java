package com.chary.springboot.hibernate.dao;

import org.springframework.data.repository.CrudRepository;

import com.chary.springboot.hibernate.entities.Student;

public interface StudentRepo extends CrudRepository<Student,Long> {

}
