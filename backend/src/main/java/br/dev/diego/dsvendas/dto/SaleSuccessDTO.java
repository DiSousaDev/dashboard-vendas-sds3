package br.dev.diego.dsvendas.dto;

import java.io.Serializable;

import br.dev.diego.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public Long getVisited() {
		return visited;
	}
	
	public Long getDeals() {
		return deals;
	}
	
}
