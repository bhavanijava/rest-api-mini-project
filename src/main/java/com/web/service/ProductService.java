package com.web.service;

import java.util.List;

import com.web.model.Charges;
import com.web.model.Product;

public interface ProductService {

	public Product saveProduct(Product product,Charges charges);
	public Product getProductById(Integer pid);
	public List<Product> getAllProducts();
	
}
