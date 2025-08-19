package com.StudentsManagementSystem.services;

import java.util.List;

import com.StudentsManagementSystem.entity.Student;

public interface StudentService {
 
	
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	
	public Student getById(long id);
	
	public void deleteById(long id);
}
