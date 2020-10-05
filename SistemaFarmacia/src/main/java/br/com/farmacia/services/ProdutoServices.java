package br.com.farmacia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmacia.model.Produto;
import br.com.farmacia.respository.ProdutoRepository;

@Service
public class ProdutoServices {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void cadastrarProduto(Produto produto) {
		produtoRepository.save(produto);

	}
	
	public List<Produto> listarProdutos(){
		return produtoRepository.findAll();
	}
	
	public void excluirProduto(Long codProd) {
		produtoRepository.deleteById(codProd);
	}
	
	public void editarProduto(Long codProd) {
		
	}

	public Produto buscarPorId(Long codProd) {
		return produtoRepository.getOne(codProd);
	}
}
