package com.pmq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pmq.po.User;

@Controller
public class ConverterController {
	@RequestMapping("/converter")
	public String myConverter(@RequestParam("user") User user, Model model) {
		model.addAttribute("user", user);
		return "showUser";
	}
}
