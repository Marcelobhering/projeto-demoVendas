package com.mar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mar.demo.dto.SaleDTO;
import com.mar.demo.repositories.SellerRepository;
import com.mar.demo.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	

	
	
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
	Page<SaleDTO> list = service.findAll(pageable);
	
	return ResponseEntity.ok(list);
	

}
}