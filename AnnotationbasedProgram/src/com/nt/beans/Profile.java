package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	
	private int sid;
	@Autowired
    private Student student;
	
	
	  public Profile() {
	  
	  }
	 
	
	

	public Student getStudent() {
		return student;
	}
	//@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Profile [student=" + student + ", sid=" + sid + "]";
	}
	
   
}