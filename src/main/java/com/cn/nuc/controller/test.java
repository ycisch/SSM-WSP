package com.cn.nuc.controller;

import com.cn.nuc.service.AdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

    @Autowired
    private AdminServer adminServer;

    @RequestMapping("/hello1.do")
    public String admin1(Model model){
        System.out.println("helllo");
        adminServer.st();
        return "adminpage/admin";

    }

}
