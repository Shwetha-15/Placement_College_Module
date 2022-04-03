package com.cg.placement.service;

import javax.persistence.EntityManager;

import com.cg.placement.entities.College;
import com.cg.placement.repository.ICollegeRepository;
import com.cg.placement.repository.CollegeRepositoryImpl;

public class CollegeServiceImpl implements ICollegeService 
{
	//Step 1 : Establishing connection between Service and Repo
	private ICollegeRepository dao;

	public CollegeServiceImpl() 
	{
		dao = new CollegeRepositoryImpl();
	}
	
    //Step 2 : Service calls to perform CRUD operation
	@Override
	public College addCollege(College college) 
	{
	    dao.beginTransaction();
	    dao.addCollege(college);
	    dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) 
	{
		dao.beginTransaction();
	    dao.updateCollege(college);
	    dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int id) 
	{
		College college = dao.searchCollege(id);
		return college;
	}

	@Override
	public Boolean deleteCollege(int id) 
	{
		dao.beginTransaction();
	    dao.deleteCollege(id);
	    dao.commitTransaction();
		return false;
	}

	@Override
	public boolean schedulePlacement(Placement placement) 
	{
		dao.beginTransaction();
	    dao.addCollege(placement);
	    dao.commitTransaction();
		return true;
	}

	@Override
	public void beginTransaction() 
	{
		
	}

	@Override
	public void commitTransaction() 
	{
		
	}
}
