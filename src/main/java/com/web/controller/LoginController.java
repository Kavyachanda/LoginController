package com.web.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.RequestParam;

import com.web.dao.LoginDAO;

	@Controller
	public class LoginController {
		
		@Autowired
		LoginDAO logindao;
		
		@RequestMapping(value="/",method=RequestMethod.GET)
		
		public String showLOGIN()
		{
			return "LOGIN";
		}
	   
		@RequestMapping(value="/submit",method=RequestMethod.POST)
		public String submit(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap m)
		{
	System.out.println("user name:"+username);
	System.out.println("password:"+password);
	
	if(logindao.submit(username,password,m))
	{
		return "HOME";
	}
	else
	{
		return "LOGIN";
	}
	}
	}