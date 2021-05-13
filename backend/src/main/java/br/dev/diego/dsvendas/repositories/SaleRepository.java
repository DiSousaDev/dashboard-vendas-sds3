package br.dev.diego.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.diego.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
