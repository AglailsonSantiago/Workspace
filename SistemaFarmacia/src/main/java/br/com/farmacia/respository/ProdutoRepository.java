package br.com.farmacia.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
