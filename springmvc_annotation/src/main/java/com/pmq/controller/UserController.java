package com.pmq.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.pmq.po.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
    public String getLogin(Model model) {
        User us = new User();
        us.setName("pmq");
        model.addAttribute("user", us);
        return "login";
    }
    @RequestMapping("/register")
    public String getRegister() {
        return "register";
    }

}
