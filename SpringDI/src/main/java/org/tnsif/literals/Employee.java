package org.tnsif.literals;
/*Program to demonstrate on DI in the form of literal*/
public class Employee {
	
	//private data members
	//DI in the form of literals
	private int empid;
	private int empname;
	private String address;
	private float salary;
	/*If you are using DI using setters use <property> 
	 * tag to achieve literals*/
	//getters and setters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpname() {
		return empname;
	}
	public void setEmpname(int empname) {
		this.empname = empname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void print() {
		System.out.println("Emp ID: "+empid+" "+"Emp name: "+empname
				+" "+"Emp address: "+address+" "+"Emp salary: "+salary);
		
	}
	public Employee(int empid, int empname, String address, float salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
		this.salary = salary;
	}
	

}
