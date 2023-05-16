package com.student.management.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentDetails {
	@Id
	int rollno;
	int age;
	int std;
	String name;
	String address;
	String email;
	
}
