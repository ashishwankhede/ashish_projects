package com.ey.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@RequestMapping("/emp")
	public ModelAndView emp()
	{
		String msg="Home";
		return new ModelAndView("home","msg",msg);
	}
	
	@RequestMapping("/student")
	public ModelAndView student()
	{
		String msg="Catalog";
		return new ModelAndView("catalog","msg",msg);
	}
	
}
