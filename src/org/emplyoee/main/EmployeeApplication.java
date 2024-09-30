package org.emplyoee.main;
import java.util.Scanner;

import org.employee.services.EmployeeServices;

public class EmployeeApplication {

	public static void main(String[] args) {
		EmployeeServices ES=new EmployeeServices();
		int choice;
	
		do {
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("1) Add the Employee");
			System.out.println("2) Display the Employee");
			System.out.println("3) Update the Employee Details");
			System.out.println("4) Search the Employee by id");
			System.out.println("5) Delete the Employee by id");
			System.out.println("6) Display the Employee Salary wise");
			System.out.println("7) Display the Employee designation wise");
			System.out.println("8) Display the Employee Department wise");
			System.out.println("9) Add the allowances and deduction");
			System.out.println("10) Generate the payment slip of employee by id");
			System.out.println("11) Exit!!!");
			
			choice=scan.nextInt();
			
			switch(choice) 
			{
			    case 1:
			    	ES.isEmpAdded();
			    	break;
			    	
			    case 2:
			    	ES.getEmployee();
			    	break;
			
			    case 3:
			    	ES.updateEmployee();
			    	break;
			    	
			    case 4:
			    	ES.searchEmployee();
			    	break;
			    	
			    case 5:
			    	ES.deleteEmployee();
			    	break;
			    	
			    case 6:
			    	ES.salaryWise();
			    	break;
			    	
			    case 7:
			    	ES.designationWise();
			    	break;
			    	
			    case 8:
			    	ES.departmentWise();
			    	break;
			    	
			    case 9:
			    	ES.addAllowance();
			    	break;
			    	
			    case 10:
			    	ES.getPaymentSlip();
			    	break;
			    	
			    case 11:
			    	System.out.println("Exit!!!");
			    	break;
			    
			    default:
			    	System.out.println("Invalid choice");
			}
			
		}while(choice!=11);

	}

}
