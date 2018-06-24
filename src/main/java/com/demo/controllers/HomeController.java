package com.demo.controllers;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entity.Product;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(value="product", method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		Product product = new Product(1L, "name1", "image.jpg", new BigDecimal(20.0), 5);
		modelMap.put("product", product);
		return "product/index";
	}

}
