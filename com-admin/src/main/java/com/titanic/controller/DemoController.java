package com.titanic.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.titanic.bean.UserDemo;
import com.titanic.service.Demoservice;



@Controller
@RequestMapping(value="demo")
public class DemoController
{

	
	@Autowired
	Demoservice demoService;
	
	
	
	@ResponseBody  
    @RequestMapping(value = "exia", method = RequestMethod.GET)
	public String demo(@RequestBody String jsonInput) throws SQLException
	{
		Gson gson = new Gson();
		System.out.println(jsonInput);
		System.err.println("aaaaaaaaaa");
		UserDemo userx = gson.fromJson(jsonInput, UserDemo.class);
		System.err.println("sssss");
//		demoService.mongo();
//		demoService.testUpdate();
//		String json = gson.toJson(userx);
		return "sssdemo/exi";
	}
}
