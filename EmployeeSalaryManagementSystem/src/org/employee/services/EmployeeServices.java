package org.employee.services;
import java.util.Scanner;
import java.util.*;
import org.employee.model.EmployeeModel;
import org.employee.repository.EmployeeRepository;


public class EmployeeServices {
	
	Scanner scan=new Scanner(System.in);
	ArrayList al=null;
	EmployeeModel EM=null;
	EmployeeRepository ER=new EmployeeRepository();
	public void isEmpAdded()
	{
		System.out.println("Enter the Employee name,email,contact,Designation,Department,salary");
		String name=scan.next();
		String email=scan.next();
		String contact=scan.next();
		String Designation=scan.next();
		String Department=scan.next();
		int salary=scan.nextInt();
		
		EM=new EmployeeModel(name,email,contact,Designation,Department,salary);
		
		int Eid=ER.getId();
		Eid+=1;
		EM.setId(Eid);
		
		boolean b=ER.isEmployeeAdded(EM);
		if(b)
			System.out.println("The Employee is Added Successfully");
		else
			System.out.println("The Employee is not added Sucessfully");
		System.out.println("=================================================================================================");
		
	}
	public void getEmployee()
	{
		al=ER.getEmployeeDetails();
		
		if(al!=null)
		{
			System.out.println("helo");
			System.out.println("Eid\tEmpName\tEmpEmail\tEmpContact\tEmpDesig\tEmpDeprt\tEmpSalary");
			System.out.println("=================================================================================================");
			for(Object obj:al)
			{
				EM=(EmployeeModel)obj;
				System.out.println(EM.getId()+"\t"+EM.getName()+"\t"+EM.getEmail()+"\t"+EM.getContact()+"\t"+EM.getDesignation()+"\t"+EM.getDepartment()+"\t"+EM.getSalary());
			}
		}
		else
			System.out.println("There is no Employee in List");
		
		System.out.println("=================================================================================================");
	}
	public void updateEmployee() 
	{
		al=ER.getEmployeeDetails();
		if(al!=null)
		{
			System.out.println("Enter the Employee id want to update");
			int id=scan.nextInt();
			scan.nextLine();
			for(Object obj:al)
			{
				EM=(EmployeeModel)obj;
				if(id==EM.getId())
				{
					System.out.println("Enter the id,name,email,contact,designation,Department,salary");
					int eid=scan.nextInt();
					EM.setId(eid);
					String name=scan.next();
					EM.setName(name);
					String email=scan.next();
					EM.setEmail(email);
					String contact=scan.next();
					EM.setContact(contact);
					String Designation=scan.next();
					EM.setDesignation(Designation);
					String Department=scan.next();
					EM.setDepartment(Department);
					int Salary=scan.nextInt();
					EM.setSalary(Salary);
				}
			}
		}
		else
			System.out.println("There is no Employee in List");
		System.out.println("=================================================================================================");
		
	}
	public void searchEmployee() 
	{
		al=ER.getEmployeeDetails();
		if(al!=null)
		{
			System.out.println("Enter the Employee id you want to search");
			int id=scan.nextInt();
			scan.nextLine();
			for(Object obj:al)
			{
				EM=(EmployeeModel)obj;
				if(id==EM.getId())
				{
					System.out.println("=================================================================================================");
					System.out.println("Eid\tEmpName\tEmpEmail\tEmpContact\tEmpDesig\tEmpSalary");
					System.out.println(EM.getId()+"\t"+EM.getName()+"\t"+EM.getEmail()+"\t"+EM.getContact()+"\t"+EM.getDesignation()+"\t"+EM.getSalary());
				}
				else
					System.out.println("There is no such employee in list");
			}
		}
		else
			System.out.println("There is no employee in List");
		System.out.println("=================================================================================================");
	}
	public void deleteEmployee() 
	{
		al=ER.getEmployeeDetails();
		if(al!=null)
		{
			System.out.println("Enter the id of Employee details you want to delete");
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("=================================================================================================");
			Iterator i=al.iterator();
			
			while(i.hasNext())
			{
				EM=(EmployeeModel)i.next();
				if(id==EM.getId())
				{
					i.remove();
					System.out.println("Employee has been deleted successfully");
				}
				
			}	
		}
		else
			System.out.println("There is no employee in List");
		System.out.println("=================================================================================================");
	}
	public void salaryWise() 
	{
		al=ER.getEmployeeDetails();
		int count=0;
		if(al!=null)
		{
			System.out.println("=================================================================================================");
			System.out.println("The Details of the Employee Salary wise");
		    System.out.println("=================================================================================================");
			for(Object obj:al)
			{
				//List list=Collections.synchronizedList(al);
				//Collections col=new Collections();
				 int flag=1;
				 EM=(EmployeeModel)obj;
				 int salary=EM.getSalary();
				 
				 for(int i=0;i<count;i++)
				 {
					 EmployeeModel EM1=(EmployeeModel)al.get(i);
					 if(EM1.getSalary()==salary)
					 {
						 flag=0;
					 }
					  
				 }
				 if(flag==1)
				 {
					 System.out.println("=================================================================================================");
					 System.out.println("Designation of Employee : "+EM.getSalary());
					 System.out.println("=================================================================================================");
					 System.out.println("Eid\tEmpName\tEmpEmail\tEmpContact\tEmpDesig\tEmpDept");
					 System.out.println("=================================================================================================");

					 for(Object obj1:al)
					{
						EmployeeModel EM2=(EmployeeModel)obj1;
						if(EM2.getSalary()==salary)
						{
							System.out.println(EM2.getId()+"\t"+EM2.getName()+"\t"+EM2.getEmail()+"\t"+EM2.getContact()+"\t"+EM2.getDesignation()+"\t"+EM2.getDepartment());
						}
					}
				 }
				 count++; 
			}
		}
		else
			System.out.println("Theere is no employee in the list");
		System.out.println("=================================================================================================");
	}
	public void designationWise() 
	{
		al=ER.getEmployeeDetails();
		int count=0;
		if(al!=null)
		{
			System.out.println("=================================================================================================");
			System.out.println("The Details of the Employee Designation wise");
		    System.out.println("=================================================================================================");
			for(Object obj:al)
			{
				 int flag=1;
				 EM=(EmployeeModel)obj;
				 String Designation=EM.getDesignation();
				 
				 for(int i=0;i<count;i++)
				 {
					 EmployeeModel EM1=(EmployeeModel)al.get(i);
					 if(EM1.getDesignation().equals(Designation))
					 {
						 flag=0;
					 }
					  
				 }
				 if(flag==1)
				 {
					 System.out.println("=================================================================================================");
					 System.out.println("Designation of Employee : "+EM.getDesignation());
					 System.out.println("=================================================================================================");
					 System.out.println("Eid\tEmpName\tEmpEmail\tEmpContact\tEmpDept\tEmpSalary");
					 System.out.println("=================================================================================================");

					 for(Object obj1:al)
					{
						EmployeeModel EM2=(EmployeeModel)obj1;
						if(EM2.getDesignation().equals(Designation))
						{
							System.out.println(EM2.getId()+"\t"+EM2.getName()+"\t"+EM2.getEmail()+"\t"+EM2.getContact()+"\t"+EM2.getDepartment()+"\t"+EM2.getSalary());

						}
					}
				 }
				 count++; 
			}
		}
		else
			System.out.println("Theere is no employee in the list");
		System.out.println("=================================================================================================");
	}
	public void departmentWise() 
	{
		al=ER.getEmployeeDetails();
		int count=0;
		if(al!=null)
		{
			System.out.println("=================================================================================================");
			System.out.println("The Details of the Employee Department wise");
		    System.out.println("=================================================================================================");
			for(Object obj:al)
			{
				int flag=1;
				EM=(EmployeeModel)obj;
				String Department=EM.getDepartment();
				for(int i=0;i<count;i++)
				{
					EmployeeModel EM1=(EmployeeModel)al.get(i);
					if(EM1.getDepartment().equals(Department))
					{
						flag=0;
					}
				}
				if(flag==1)
				{
					System.out.println("=================================================================================================");
					System.out.println("Department of Employee : "+EM.getDepartment());
					System.out.println("=================================================================================================");
					System.out.println("Eid\tEmpName\tEmpEmail\tEmpContact\tEmpDesig\tEmpSalary");
					System.out.println("=================================================================================================");
					for(Object obj1:al)
					{
						EmployeeModel EM2=(EmployeeModel)obj1;
						if(EM2.getDepartment().equals(Department))
						{
							System.out.println(EM2.getId()+"\t"+EM2.getName()+"\t"+EM2.getEmail()+"\t"+EM2.getContact()+"\t"+EM2.getDesignation()+"\t"+EM2.getSalary());
						}
					}
				}
				count++;
			}
		}
		else
			System.out.println("There is no employee in the list");
		System.out.println("=================================================================================================");
		
	}
	public void addAllowance() 
	{
		System.out.println("=================================================================================================");
		al=ER.getEmployeeDetails();
		if(al!=null)
		{
			for(Object obj:al)
			{
				EM=(EmployeeModel)obj;
				System.out.println("Enter Allowance for Employee");
				System.out.println("Enter the Medical Allowance");
				int MA=scan.nextInt();
				EM.setMediAllowance(MA);
				
				System.out.println("Enter the House Allowance");
				int HA=scan.nextInt();
				EM.setHouseAllowance(HA);
				
				System.out.println("Enter the Travel Allowance");
				int TA=scan.nextInt();
				EM.setTravelAllowance(TA);
				
				System.out.println("Enter the Provident fund deduction");
				int PD=scan.nextInt();
				EM.setProvidentFunc(PD);
				
				System.out.println("Enter the professional Tax deduction");
				int PT=scan.nextInt();
				EM.setProfessionalTax(PT);
				
				int TotalSal=EM.getSalary();
			
				TotalSal=TotalSal+MA+HA+TA-PD-PT;
			
				EM.setTotalSalary(TotalSal);
				System.out.println("=================================================================================================");
			}
		}
		else
			System.out.println("There is no employee in the list");
		System.out.println("=================================================================================================");
	}
	public void getPaymentSlip() 
	{
		System.out.println("=================================================================================================");
		al=ER.getEmployeeDetails();
		if(al!=null)
		{
			System.out.println("Eid\tEmpName\tEmpEmail\tEmpContact\tEmpDesig\tEmpSal\tMedAll\tTraAll\tHouAll\tPfAll\tPtAll\tTotalSal");
			for(Object obj:al)
			{
				EM=(EmployeeModel)obj;
				System.out.println(EM.getId()+"\t"+EM.getName()+"\t"+EM.getEmail()+"\t"+EM.getContact()+"\t"+EM.getDesignation()+"\t"+EM.getSalary()+"\t"+
				EM.getMediAllowance()+"\t"+EM.getTravelAllowance()+"\t"+EM.getHouseAllowance()+"\t"+EM.getProvidentFunc()+"\t"+EM.getProfessionalTax()+"\t"+
				EM.getTotalSalary());
			}
		}
		else
			System.out.println("There is no employee in the list");
		System.out.println("=================================================================================================");
	}
	
}
