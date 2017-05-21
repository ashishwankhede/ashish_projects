package com.ey.Model;

public class Emp_Model 
{
	int id;
	String name,dept;
	double salary;
	
	
	Emp_Model()
	{
		
	}
	public Emp_Model(int id,String name)
	{
		this.id=id;
		this.name=name;
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
	
	public String getDept() {
		return dept;
	}
	public void setDept(String Dept){
		this.dept = dept;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double Salary){
		this.salary = salary;
	}
	
}
