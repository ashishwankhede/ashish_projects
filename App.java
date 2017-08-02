package com.ey.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ey.Model.Emp_Model;
import com.ey.Service.EmpDaoImpl;

public class App 
{
	public static void main(String[] args)
	{
		System.out.println();
		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		
		EmpDaoImpl ed = app.getBean("empdao",EmpDaoImpl.class);
		
		//Emp_Model e = new Emp_Model(1,"ashish");
		
		//ed.temp(e);
		
		System.out.println(" main ");
		
	}
}
