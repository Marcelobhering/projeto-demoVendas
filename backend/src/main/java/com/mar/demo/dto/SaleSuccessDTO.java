package com.mar.demo.dto;

import java.io.Serializable;

import com.mar.demo.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long Visited;
	private Long deals;
	
	public SaleSuccessDTO() {
		super();
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		super();
		sellerName = seller.getName();
		this.Visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return Visited;
	}

	public void setVisited(Long visited) {
		Visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	


	
	

}
