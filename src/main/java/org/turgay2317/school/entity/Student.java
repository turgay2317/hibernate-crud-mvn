package org.turgay2317.school.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "students")
@Table(name = "students")
public class Student implements Serializable{
	
	@Id
	@Column(name = "studentID")
	private int studentID;
	
	@Column(name = "studentName")
	private String studentName;
	
	@Column(name = "studentSurname")
	private String studentSurname;
	
	public Student() {
		
	}
	
	public Student(int studentID, String studentName, String studentSurname) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}



	public Student(String studentName, String studentSurname) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentSurname() {
		return studentSurname;
	}
	
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ "]";
	}
	
	
		

}
