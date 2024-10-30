package com.demo.controller;

import com.demo.dto.Student;
import com.demo.service.StudentService;

public class SaveController {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("vinni");
		s.setId(27);
		s.setAge(24);
		s.setGender('f');
		s.setPhoneNumber(9876543210L);
		StudentService ss=new StudentService();
		Student s1=ss.saveStudent(s);
		if(s1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("please check the code.");
		}
	}

}
