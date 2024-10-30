package com.demo.controller;

import com.demo.dto.Student;
import com.demo.service.StudentService;

public class GetByIdController {
	public static void main(String[] args) {
		StudentService ss=new StudentService();
		Student s1=ss.getById(1);
		if(s1!=null) {
			System.out.println("Student name is: "+s1.getName());
			System.out.println("Student id is: "+s1.getId());
			System.out.println("Student gender is: "+s1.getGender());
			System.out.println("Student age is: "+s1.getAge());
			System.out.println("Student phone number is: "+s1.getPhoneNumber());
		}
		else {
			System.out.println("please check the code.");
		}
	}

}
