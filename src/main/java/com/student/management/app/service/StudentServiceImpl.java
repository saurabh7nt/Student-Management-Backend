package com.student.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.management.app.model.*;
import com.student.management.app.repository.*;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public StudentDetails saveStudent(StudentDetails studentDetails) {
		studentRepository.save(studentDetails);
		return studentDetails;
	}

	@Override
	public String deleteStudent(Integer id) {
		studentRepository.deleteById(id);
		return "Student deleted.";
	}

	@Override
	public List<StudentDetails> getAllStudents() {		
		return studentRepository.findAll();
	}
		
}
