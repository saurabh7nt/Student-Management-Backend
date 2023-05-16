package com.student.management.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.management.app.model.*;
import com.student.management.app.service.*;

@CrossOrigin()
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public StudentDetails saveStudent(@RequestBody StudentDetails studentDetails) {
		studentService.saveStudent(studentDetails);
		return studentDetails;
	}

	@DeleteMapping("/getById/{rollno}")
	public String deleteStudent(@PathVariable Integer rollno) {
		studentService.deleteStudent(rollno);
		return "Student deleted.";
	}

	@GetMapping("/getAllStudents")
	public List<StudentDetails> getAllStudents() {
		return studentService.getAllStudents();
	}

}
