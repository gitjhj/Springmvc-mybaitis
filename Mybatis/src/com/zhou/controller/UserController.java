package com.zhou.controller;

import com.zhou.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhou.service.UserService;
 
    @Controller
    public class UserController {
 
	@Autowired
	private UserService userService;
	
    @RequestMapping(value="index")
    public ModelAndView index(Users users){
    	userService.insertUser(users);
        userService.updateUser();
        ModelAndView mav=new ModelAndView();
        mav.setViewName("index");
        mav.addObject("user", users);
        return mav;
    }
     
}