package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.FixedCharges;
import com.web.repo.FixedChargesRepo;

@Service
public class FixedChargeServiceImp implements FixedChargeService {
	
	@Autowired
	private FixedChargesRepo repo;
	
	@Override
	public FixedCharges saveProduct(FixedCharges f) {
		return repo.save(f);
	}

	@Override
	public List<FixedCharges> findAll() {
		return repo.findAll();
	}

}
