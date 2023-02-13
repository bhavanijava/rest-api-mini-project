package com.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="charges_table")
public class Charges {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer cid;
	private Double gst;
	private Double deliverCharge;
	
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "charges", fetch = FetchType.LAZY)
    private Product product;
    
    
	public Charges() {
		super();
	}


	public Charges(Integer cid, Double gst, Double deliverCharge, Product product) {
		super();
		this.cid = cid;
		this.gst = gst;
		this.deliverCharge = deliverCharge;
		this.product = product;
	}


	

	public void setCid(Integer cid) {
		this.cid = cid;
	}


	public Double getGst() {
		return gst;
	}


	public void setGst(Double gst) {
		this.gst = gst;
	}


	public Double getDeliverCharge() {
		return deliverCharge;
	}


	public void setDeliverCharge(Double deliverCharge) {
		this.deliverCharge = deliverCharge;
	}


	


	public void setProduct(Product product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Charges [cid=" + cid + ", gst=" + gst + ", deliverCharge=" + deliverCharge + ", product=" + product
				+ "]";
	}


	
	
}
