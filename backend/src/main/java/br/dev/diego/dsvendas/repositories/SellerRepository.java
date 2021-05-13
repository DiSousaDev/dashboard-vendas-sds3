package br.dev.diego.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.diego.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
