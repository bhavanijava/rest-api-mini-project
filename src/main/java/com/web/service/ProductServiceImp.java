package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Charges;
import com.web.model.FixedCharges;
import com.web.model.Product;
import com.web.repo.ChargesRepo;
import com.web.repo.FixedChargesRepo;
import com.web.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepo prepo;
	
	@Autowired
	private ChargesRepo chrepo;
	
	@Autowired
    private FixedChargesRepo fixedRepo;
	
	@Override
	public Product saveProduct(Product product, Charges charges) {
		FixedCharges fcharges=fixedRepo.findById(product.getPcategory()).get();		

		if(product.getPcategory().equalsIgnoreCase(fcharges.getProCat())) {

			Double discount=(product.getBasicPrice()*(fcharges.getDiscount()));

			Double cost=product.getBasicPrice()-discount;

			Double gstAmount=(cost*(fcharges.getGst()));
			Double delcharge=fcharges.getDelcharge();
			Double totAmt=cost+gstAmount+delcharge;


			charges.setGst(gstAmount);
			charges.setDeliverCharge(delcharge);
			Charges nc = chrepo.save(charges);	

			product.setDiscount(discount);
			product.setFinalPrice(totAmt);
			product.setCharges(nc);
			prepo.save(product);
		}
		return product;
	}

	@Override
	public Product getProductById(Integer pid) {
		return prepo.findById(pid).get();
	}

	@Override
	public List<Product> getAllProducts() {
		return prepo.findAll();
	}

}
