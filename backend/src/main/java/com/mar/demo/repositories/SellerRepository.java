package com.mar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mar.demo.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
	//crud pelo framework

}
