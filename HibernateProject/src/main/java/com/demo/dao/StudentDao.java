package com.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.dto.Student;



public class StudentDao {
	
	public Student saveStudent(Student s) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sahaa");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		if(s!=null) {
			et.begin();
			em.merge(s);
			et.commit();
		}
		return s;
		
	}
	public Student updateStudent(Student s) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sahaa");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s1=em.find(Student.class,s.getId());
		if(s1!=null) {
			et.begin();
			em.merge(s);
			et.commit();
		}
		return s1;
		
	}
	public Student deleteStudent(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sahaa");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s1=em.find(Student.class,id);
		if(s1!=null) {
			et.begin();
			em.remove(s1);
			et.commit();
		}
		
		return s1;
		
		
	}
	public Student getById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sahaa");
		EntityManager em=emf.createEntityManager();
		Student s1=em.find(Student.class,id);
		return s1;
		
	}
	public List<Student> getByAll(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sahaa");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("Select a from Student a");
		List<Student> li=query.getResultList();
		return query.getResultList();
		
	}

}
