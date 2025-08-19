package com.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.services.StudentService;

@Service
public class ServiceImpl implements StudentService {

	 @Autowired
	 com.StudentsManagementSystem.repository.Studentrepository Studentrepository ;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		 List<Student> list=Studentrepository.findAll(); 
		 return list;
	}
	public Student saveStudent(Student student) {
		return Studentrepository.save(student);
	}
	@Override
	public Student getById(long id) {
		// TODO Auto-generated method stub
		return Studentrepository.findById(id).get();
	}
	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		 Studentrepository.deleteById(id);
	}

}
