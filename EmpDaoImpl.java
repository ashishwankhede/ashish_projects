package com.ey.Service;

import java.util.List;

import org.hibernate.Hibernate;

import com.ey.Dao.EmpDao;
import com.ey.Model.Emp_Model;

import org.springframework.orm.hibernate3.HibernateTemplate;  


public class EmpDaoImpl //implements EmpDao 
{
	HibernateTemplate hiberTemplate;
	
	public boolean temp(Emp_Model e) 
	{
		return hiberTemplate.update(e);
	}

	/*@Override
	public boolean update(Emp_Model e) 
	{
		return hiberTemplate.update(e);
	}

	@Override
	public boolean delete(Emp_Model e,int id) 
	{
		return hiberTemplate.delete(e,id);
	}

	@Override
	public List<Emp_Model> selectAll() 
	{
		hiberTemplate.find("select *from Emp_Model");
		return null;
	}

	@Override
	public List<Emp_Model> selectById(Emp_Model e, int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	*/
		
}
