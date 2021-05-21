package br.dev.diego.dsvendas.dto;

import java.io.Serializable;

import br.dev.diego.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;

	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public Double getSum() {
		return sum;
	}

}


