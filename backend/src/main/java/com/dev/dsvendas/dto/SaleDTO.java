package com.dev.dsvendas.dto;

import java.time.LocalDate;

import com.dev.dsvendas.entities.Sale;

public class SaleDTO {

	private Long id;
	private Integer visted;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleDTO(Long id, Integer visted, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visted = visted;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	

	public SaleDTO(Sale entity) {
		this.id = entity.getId();
		this.visted = entity.getVisited();
		this.deals = entity.getDeals();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.seller = new SellerDTO( entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisted() {
		return visted;
	}

	public void setVisted(Integer visted) {
		this.visted = visted;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	
	
}
