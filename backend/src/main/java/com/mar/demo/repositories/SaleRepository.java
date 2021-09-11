package com.mar.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mar.demo.dto.SaleSuccessDTO;
import com.mar.demo.dto.SaleSumDTO;
import com.mar.demo.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	//crud pelo framework
	
	@Query("SELECT new com.mar.demo.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"+
	"FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO>amountGroupedBySeller();
	
	@Query("SELECT new com.mar.demo.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"+
			"FROM Sale AS obj GROUP BY obj.seller")
			List<SaleSuccessDTO>successGroupedBySeller();

}
