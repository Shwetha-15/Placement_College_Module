package com.cg.placement.client;

import com.cg.placement.entities.College;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICollegeService;

public class Client 
{
	public static void main(String[] args) 
	{	
		College college = new College();
		ICollegeService service = new CollegeServiceImpl();
		
//		//Create
//		college.setId(55);
//		college.setCollegeAdmin("Shwe");
//		college.setCollegeName("NSAM");
//		college.setLocation("Bengaluru");
//		service.addCollege(college);
//		
		//Retrieve
		college = service.searchCollegeById(8);
		System.out.println("Id is: "+college.getId());
		System.out.println("college admin is: "+college.getCollegeAdmin());
		System.out.println("college name is: "+college.getCollegeName());
		System.out.println("location is: "+college.getLocation());
		
		System.out.println("College details added in database");
//		
//		//Update
//		college = service.searchCollegeById(8);
//		college.setCollegeName("NMIT University");
//		service.updateCollege(college);
//		System.out.println("Update is successful");
		
		//Delete
		college = service.searchCollegeById(8);
		service.deleteCollegeById(8);
		System.out.println("Delete is successful");
	}
}
