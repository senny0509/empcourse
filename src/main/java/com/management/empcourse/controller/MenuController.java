package com.management.empcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
    @GetMapping("/menu")
    public String getMenu(){
        return "/menu";
    }

//    @RequestMapping("member/add")
//    public String getMemberAdd(){
//        return "member/add";
//    }
    //@RequestMapping
    @RequestMapping("/list")
    public String getList(){
        return "/list";
    }
}
