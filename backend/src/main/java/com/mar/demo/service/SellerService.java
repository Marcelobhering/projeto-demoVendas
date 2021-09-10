package com.mar.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mar.demo.dto.SellerDTO;
import com.mar.demo.entities.Seller;
import com.mar.demo.repositories.SellerRepository;

@Service
public class SellerService { //implementação básica em camada
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO>findAll(){
		
		List<Seller> result = repository.findAll();
		
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());

}
}