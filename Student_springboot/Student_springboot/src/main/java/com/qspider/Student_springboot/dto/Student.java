package com.qspider.Student_springboot.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
    int stud_id;
    String stud_name;
    String stud_age;
    String stud_email;
    long stud_mobile;
    
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_age() {
		return stud_age;
	}
	public void setStud_age(String stud_age) {
		this.stud_age = stud_age;
	}
	public String getStud_email() {
		return stud_email;
	}
	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}
	public long getStud_mobile() {
		return stud_mobile;
	}
	public void setStud_mobile(long stud_mobile) {
		this.stud_mobile = stud_mobile;
	}
    
    
}
