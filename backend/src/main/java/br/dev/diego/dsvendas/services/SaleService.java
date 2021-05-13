package br.dev.diego.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.diego.dsvendas.dto.SaleDTO;
import br.dev.diego.dsvendas.entities.Sale;
import br.dev.diego.dsvendas.repositories.SaleRepository;
import br.dev.diego.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findaAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> sale = repository.findAll(pageable);
		// converte a lista de Sale em lista de SaleDTO 
		return sale.map(x -> new SaleDTO(x));
	}

}
