package com.demo.controller;

import com.demo.dto.Student;
import com.demo.service.StudentService;

public class UpdateController {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("mahi");
		s.setAge(21);
		s.setGender('m');
		s.setPhoneNumber(8765653427L);
		s.setId(1);
		StudentService ss=new StudentService();
		Student s1=ss.updateStudent(s);
		if(s1!=null) {
			System.out.println("updation is successful....");
		}
		else {
			System.out.println("please check the code.");
		}
	}

}
