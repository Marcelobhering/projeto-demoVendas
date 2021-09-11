package com.mar.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mar.demo.dto.SaleDTO;
import com.mar.demo.dto.SaleSuccessDTO;
import com.mar.demo.dto.SaleSumDTO;
import com.mar.demo.entities.Sale;
import com.mar.demo.repositories.SaleRepository;
import com.mar.demo.repositories.SellerRepository;
@Service
public class SaleService {
	
	
	 //implementação básica em camada
		
		@Autowired
		private SaleRepository repository;
		
		@Autowired
		private SellerRepository sellerRepository;
		
		@Transactional(readOnly = true)
		public Page<SaleDTO>findAll(Pageable pageable){
			sellerRepository.findAll();
			Page<Sale> result = repository.findAll(pageable);
			
			return result.map(x -> new SaleDTO(x));
	
	

}
		@Transactional(readOnly = true)
		public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
		
		
}
		

		@Transactional(readOnly = true)
		public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
}
}

