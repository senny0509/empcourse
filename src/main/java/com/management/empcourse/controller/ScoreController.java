package com.management.empcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.management.empcourse.controller.form.ScoreForm;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScoreController {
    @RequestMapping("score/add")
    public String getAdd(ScoreForm form, Model model)
    {
        model.addAttribute("scoreForm",form);
        return "score/add";
    }

    @RequestMapping("score/list")
    public String getList(ScoreForm form, Model model)
    {
        model.addAttribute("scoreForm",form);
        return "score/list";
    }
}
