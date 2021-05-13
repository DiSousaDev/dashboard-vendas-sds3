package br.dev.diego.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.diego.dsvendas.dto.SellerDTO;
import br.dev.diego.dsvendas.entities.Seller;
import br.dev.diego.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findaAll(){
		List<Seller> seller = repository.findAll();
		// converte a lista de Seller em lista de SellerDTO 
		return seller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
