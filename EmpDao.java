package com.ey.Dao;

import java.util.List;

import com.ey.Model.Emp_Model;

public interface EmpDao 
{
	public boolean create(Emp_Model e);
	public boolean update(Emp_Model e);
	public boolean delete(Emp_Model e);
	public List<Emp_Model> selectAll();
	public List<Emp_Model> selectById(Emp_Model e,int id);
	
}
