package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="PRODUCT_Fixed_Chages")
public class FixedCharges {
	@Id
	private String proCat;
	private Double discount;
	private Double gst;
	private Double delcharge;
	public FixedCharges() {
		super();
	}
	public FixedCharges(Integer fid, String proCat, Double discount, Double gst, Double delcharge) {
		super();
		this.proCat = proCat;
		this.discount = discount;
		this.gst = gst;
		this.delcharge = delcharge;
	}
	
	public String getProCat() {
		return proCat;
	}
	public void setProCat(String proCat) {
		this.proCat = proCat;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getGst() {
		return gst;
	}
	public void setGst(Double gst) {
		this.gst = gst;
	}
	public Double getDelcharge() {
		return delcharge;
	}
	public void setDelcharge(Double delcharge) {
		this.delcharge = delcharge;
	}
	@Override
	public String toString() {
		return "FixedCharges [ proCat=" + proCat + ", discount=" + discount + ", gst=" + gst
				+ ", delcharge=" + delcharge + "]";
	}
	
	
	
	

}
