package com.cn.nuc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.nuc.service.GroupServer;
import com.cn.nuc.service.WebServer;

@Controller
public class WebTest {
	
	@Autowired
	private WebServer webServer;
	
	@Autowired
	private GroupServer groupServer;
	
	@RequestMapping("/hello.do")
	public void test() {
		System.out.println("Hello World");
		webServer.displayStudent();
		groupServer.selectByStudent();
	}
	
	@RequestMapping(value = "/login.do",method = RequestMethod.GET)
	public String login(){
		return "adminpage/admin";
	}

}
