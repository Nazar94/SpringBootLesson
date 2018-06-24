package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="demo")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("age", 23);
		modelMap.put("username", "user1account");
		modelMap.put("price", 4.5);
		modelMap.put("status", true);
		return "demo/index";
	}

}
