package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Charges;
import com.web.model.Product;
import com.web.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pservice;
	
	@PostMapping("/psave")
	public Product save(@RequestBody Product product,Charges charges) {
		return pservice.saveProduct(product, charges);
	}
	
	@GetMapping("/pfindAll")
	public List<Product> getAllProducts(){		
		return pservice.getAllProducts();
	}
	
	@GetMapping("/findOne/{pid}")
	public Product getOnePro(@PathVariable Integer pid)
	{
		return pservice.getProductById(pid);
	}
	
}
