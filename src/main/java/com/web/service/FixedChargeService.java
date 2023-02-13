package com.web.service;

import java.util.List;

import com.web.model.FixedCharges;

public interface FixedChargeService {

	public FixedCharges saveProduct(FixedCharges f);
	public List<FixedCharges> findAll();
}
