package com.mar.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {
	
	@Id  // indica qual é a chave primaria
	@GeneratedValue(strategy =GenerationType.IDENTITY ) // id vai ser auto incrementavel "gera novo id"
	private long id;
	private String name;
	
	
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
		super();
	}



	public Seller(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public long getId() {
		return id;
	}



	public List<Sale> getSales() {
		return sales;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
