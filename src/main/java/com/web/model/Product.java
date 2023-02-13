package com.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="prod_table")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pid;
	private String pname;
	private String ptype;
	private String pcategory;
	private Double basicPrice;
	private Double discount;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cid_fk", referencedColumnName = "cid")
	private Charges charges;
	
	private Double finalPrice;

	public Product() {
		super();
	}

	public Product(Integer pid, String pname, String ptype, String pcategory, Double basicPrice, Double discount,
			Charges charges, Double finalPrice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.pcategory = pcategory;
		this.basicPrice = basicPrice;
		this.discount = discount;
		this.charges = charges;
		this.finalPrice = finalPrice;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public Double getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(Double basicPrice) {
		this.basicPrice = basicPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", pcategory=" + pcategory
				+ ", basicPrice=" + basicPrice + ", discount=" + discount + ", charges=" + charges + ", finalPrice="
				+ finalPrice + "]";
	}

	
	
	
	
	
}
