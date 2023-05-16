package com.student.management.app.service;

import java.util.List;
import com.student.management.app.model.*;

public interface StudentService{
	public StudentDetails saveStudent(StudentDetails studentDetails);
	public String deleteStudent(Integer id);
	public List<StudentDetails> getAllStudents();
}
