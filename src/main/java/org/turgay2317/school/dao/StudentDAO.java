package org.turgay2317.school.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.turgay2317.school.entity.Student;

public class StudentDAO {
	
	private static SessionFactory factory;
	
	public StudentDAO() {
		factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();
	}
	
	public List<Student> list(){
		List<Student> studentList = null;
		Session currentSession = factory.getCurrentSession();
		currentSession.beginTransaction();
		studentList = currentSession.createQuery("from students").getResultList();
		currentSession.close();
		return studentList;
	}
	
	public void save(Student student) {
		Session currentSession = factory.getCurrentSession();
		currentSession.beginTransaction();
		currentSession.save(student);
		System.out.println("Student added");
		currentSession.getTransaction().commit();
		currentSession.close();
	}
	
	public void update(Student student) {
		Session currentSession = factory.getCurrentSession();
		currentSession.beginTransaction();
		currentSession.update(student);
		System.out.println("Student updated");
		currentSession.getTransaction().commit();
		currentSession.close();
	}
	
	public Student get(int studentID) {
		Student data = null;
		Session currentSession = factory.getCurrentSession();
		currentSession.beginTransaction();
		data = currentSession.get(Student.class, studentID);
		currentSession.close();
		return data;
	}
	
	public void delete(Student student) {
		Session currentSession = factory.getCurrentSession();
		currentSession.beginTransaction();
		currentSession.delete(student);
		currentSession.getTransaction().commit();
		currentSession.close();
	}
}
