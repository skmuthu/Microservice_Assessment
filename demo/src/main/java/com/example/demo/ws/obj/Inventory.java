package com.example.demo.ws.obj;

import java.util.Date;

public class Inventory {

    private String productId;
    private String prodName;
    private String UOM;
    private Double availQty;
    private Date availDate;

    public Inventory(String productId, String prodName,String UOM,Double availQty, Date availDate) {
    	this.productId = productId;
    	this.prodName = prodName;
    	this.UOM = UOM;
    	this.availQty = availQty;
    	this.availDate =availDate;
    }

   public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public Double getAvailQty() {
		return availQty;
	}

	public void setAvailQty(Double availQty) {
		this.availQty = availQty;
	}

	public Date getAvailDate() {
		return availDate;
	}

	public void setAvailDate(Date availDate) {
		this.availDate = availDate;
	}
}