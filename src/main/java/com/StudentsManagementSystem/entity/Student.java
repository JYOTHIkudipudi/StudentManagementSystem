package com.StudentsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="students")
public class Student {
	     
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
        private long id;
	
	    @Column (name = "first_name")
        private String FirstName;
	    
	    @Column (name= "last_name")
        private String LastName;
        private String email;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String firstName, String lastName, String email) {
			super();
			this.id = id;
			FirstName = firstName;
			LastName = lastName;
			this.email = email;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
}
