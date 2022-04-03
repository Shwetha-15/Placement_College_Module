package com.cg.placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.osgi.service.useradmin.User;

public class College 
{
    private int id;
    private User collegeAdmin;
    private String collegename;
    private String location;
    
    @OneToMany(mappedBy="college",cascade=CascadeType.ALL)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
