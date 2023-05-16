package com.student.management.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.management.app.model.*;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{
	
}
