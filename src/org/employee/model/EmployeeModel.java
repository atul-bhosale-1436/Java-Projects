package org.employee.model;

public class EmployeeModel {
	
	private int id;
	private String name;
	private String email;
	private String contact;
	private String Designation;
	private String Department;
	private int salary;
	
	private int TotalSalary;
	private int MediAllowance;
	private int TravelAllowance;
	private int HouseAllowance;
	private int ProvidentFunc;
	private int ProfessionalTax;
	
	
	public EmployeeModel()
	{
		
	}
	public EmployeeModel(String name, String email, String contact, String Designation, String Department,int salary)
	{
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.Designation=Designation;
		this.Department=Department;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTotalSalary() {
		return TotalSalary;
	}
	public void setTotalSalary(int totalSalary) {
		TotalSalary = totalSalary;
	}
	public int getMediAllowance() {
		return MediAllowance;
	}
	public void setMediAllowance(int mediAllowance) {
		MediAllowance = mediAllowance;
	}
	public int getTravelAllowance() {
		return TravelAllowance;
	}
	public void setTravelAllowance(int travelAllowance) {
		TravelAllowance = travelAllowance;
	}
	public int getHouseAllowance() {
		return HouseAllowance;
	}
	public void setHouseAllowance(int houseAllowance) {
		HouseAllowance = houseAllowance;
	}
	public int getProvidentFunc() {
		return ProvidentFunc;
	}
	public void setProvidentFunc(int providentFunc) {
		ProvidentFunc = providentFunc;
	}
	public int getProfessionalTax() {
		return ProfessionalTax;
	}
	public void setProfessionalTax(int professionalTax) {
		ProfessionalTax = professionalTax;
	}

}
