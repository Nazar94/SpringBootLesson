package com.demo.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1L, "name1", "image.jpg", new BigDecimal(20.0), 5));
		products.add(new Product(2L, "name2", "image.jpg", new BigDecimal(21.0), 4));
		products.add(new Product(3L, "name3", "image.jpg", new BigDecimal(22.0), 3));
		products.add(new Product(4L, "name4", "image.jpg", new BigDecimal(23.0), 2));
		modelMap.put("products", products);
		return "product/index";
	}

}
