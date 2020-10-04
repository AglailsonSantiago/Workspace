package br.com.farmacia.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{

}
