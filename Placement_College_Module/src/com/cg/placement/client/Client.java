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
		
		//Create
		college.setId(10);
		college.setCollegename("NMIT");
		//college.setCollegeAdmin(Akash);
		college.setLocation("Bangalore");
		
		college.setId(11);
		college.setCollegename("SVCE");
		//college.setCollegeAdmin(User);
		college.setLocation("Mumbai");
		
		//Retrieve
		college = service.searchCollege(10);
		System.out.println("ID is: "+college.getId());
		System.out.println("College Name is: "+college.getCollegename());
		System.out.println("College Admin is: "+college.getCollegeAdmin());
		System.out.println("College Location is: "+college.getLocation());
		
		//Update
		college = service.searchCollege(10);
		college.setCollegename("Reva University");
		service.updateCollege(college);
		System.out.println("Update is successful");
		
		//Delete
		college = service.searchCollege(11);
		service.deleteCollege(11);
		System.out.println("Delete is successful");
	}
}
