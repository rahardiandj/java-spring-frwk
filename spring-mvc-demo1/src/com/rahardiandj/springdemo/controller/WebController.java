package com.rahardiandj.springdemo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.rahardiandj.service.demo.GenericWelcomeService;
import com.rahardiandj.service.demo.WelcomeService;

@Controller
public class WebController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		//1
		//WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("RJuliart");
		
		//2
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//3
		return "welcomeNew";
	}

}
