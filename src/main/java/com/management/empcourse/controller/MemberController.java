package com.management.empcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.management.empcourse.controller.form.MemberForm;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    //private Object form;

//    @GetMapping("member/add")
    @RequestMapping("member/add")
    public String getAdd(MemberForm form,Model model) {
        model.addAttribute("memberForm",form);
        return "member/add";
    }
    @RequestMapping("member/list")
    public String getList(MemberForm form,Model model) {
        model.addAttribute("memberForm",form);
        return "member/list";
    }


}
