package com.demo.controller;

import com.demo.dto.Student;
import com.demo.service.StudentService;

public class DeleteController {
	public static void main(String[] args) {
		Student s=new Student();
		StudentService ss=new StudentService();
		Student s1=ss.deleteStudent(2);
		if(s1!=null) {
			System.out.println("deletion is successful.....");
		}
		else {
			System.out.println("please check the code.");
		}
	}

}
