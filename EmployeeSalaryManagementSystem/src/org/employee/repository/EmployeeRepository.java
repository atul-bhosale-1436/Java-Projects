package org.employee.repository;

import java.util.ArrayList;

import org.employee.model.EmployeeModel;


public class EmployeeRepository {

	static ArrayList al=new ArrayList();
	
	public  int getId()
	{
		return al.size();
	}
	
	public boolean isEmployeeAdded(EmployeeModel EM)
	{ 
		boolean b=al.add(EM);
		return b;
	}
	public ArrayList getEmployeeDetails()
	{
		return al.size()>0?al:null;
	}
}
