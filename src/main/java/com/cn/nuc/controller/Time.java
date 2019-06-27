package com.cn.nuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Time {


    @RequestMapping(value = "/testjson.do")
    @ResponseBody
    public Map<String, String> testjson(){
        System.out.println("进来了么");
        Map<String, String> map = new HashMap<>();
        map.put("asd1","asd4");
        map.put("asd2","asd3");
        map.put("asd3","asd5");
        return map;
    }
}
