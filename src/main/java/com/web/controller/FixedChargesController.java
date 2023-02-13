package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.FixedCharges;
import com.web.service.FixedChargeService;

@RestController
public class FixedChargesController {
	
	@Autowired
	private FixedChargeService service;

	@PostMapping("/fsave")
	public FixedCharges save(@RequestBody FixedCharges fd)
	{
		return service.saveProduct(fd);
	}
	
	@GetMapping("/ffindAll")
	public List<FixedCharges> findAll()
	{
		return service.findAll();
	}
	
	
	
}
