package com.mar.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mar.demo.dto.SaleDTO;
import com.mar.demo.dto.SaleSuccessDTO;
import com.mar.demo.dto.SaleSumDTO;
import com.mar.demo.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	

	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
	Page<SaleDTO> list = service.findAll(pageable);
	return ResponseEntity.ok(list);
	

}     //"/sum-by-sellers"
	//value = "/amount-by-seller"
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
	List<SaleSumDTO> list = service.amountGroupedBySeller();
	return ResponseEntity.ok(list);
	
	
	
}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
	List<SaleSuccessDTO> list = service.successGroupedBySeller();
	return ResponseEntity.ok(list);
}
}

