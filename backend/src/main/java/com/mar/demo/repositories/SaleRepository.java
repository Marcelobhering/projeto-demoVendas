package com.mar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mar.demo.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	//crud pelo framework

}
