package com.ey.Model;

public class Emp_Model 
{
	int id;
	String name;
	
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
}
