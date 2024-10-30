package com.demo.controller;

import java.util.List;

import com.demo.dto.Student;
import com.demo.service.StudentService;

public class GetByAllController {
	public static void main(String[] args) {
		StudentService ss=new StudentService();
		List<Student> li=ss.getByAll();
		if(li!=null) {
			for(Student s : li) {
				System.out.println("Student name is: "+s.getName());
				System.out.println("Student id is: "+s.getId());
				System.out.println("Student age is: "+s.getAge());
				System.out.println("Student gender is: "+s.getGender());
				System.out.println("Student phone number is: "+s.getPhoneNumber());
				System.out.println("--------------------------------------------------");
			}
		}
	}

}
