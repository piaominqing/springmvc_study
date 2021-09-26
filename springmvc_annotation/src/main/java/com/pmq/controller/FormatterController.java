package com.pmq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pmq.po.User;

@Controller
public class FormatterController {
	@RequestMapping("/formatter")
	public String myFormatter(User us, Model model) {
        model.addAttribute("user", us);
        return "showUserFormatter";
    }
}
