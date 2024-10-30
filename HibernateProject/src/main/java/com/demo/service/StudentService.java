package com.demo.service;

import java.util.List;

import com.demo.dao.StudentDao;
import com.demo.dto.Student;

public class StudentService {
	StudentDao sd=new StudentDao();
	public Student saveStudent(Student s) {
		return sd.saveStudent(s);
	}
	public Student updateStudent(Student s) {
		return sd.updateStudent(s);
	}
	public Student deleteStudent(int id) {
		return sd.deleteStudent(id);
	}
	public Student getById(int id) {
		return sd.getById(id);
	}
	public List<Student> getByAll(){
		return sd.getByAll();
	}

}
