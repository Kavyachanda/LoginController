package com.web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

@Repository
public class LoginDAO {
	
	public boolean submit(String username, String password, ModelMap m)
	{
		if(username.equals("user")&&password.equals("12345"))
		{
			m.addAttribute("username", username);
			return true;
		}
	else
		{
			m.addAttribute("errormsg"," username and password doesnt match");
			return false;
		}
}
}
