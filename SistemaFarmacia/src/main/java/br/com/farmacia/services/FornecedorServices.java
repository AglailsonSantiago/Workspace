package br.com.farmacia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmacia.model.Fornecedor;
import br.com.farmacia.respository.FornecedorRepository;

@Service
public class FornecedorServices {
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public void cadastrarFornecedor(Fornecedor fornecedor) {
		fornecedorRepository.save(fornecedor);

	}
	
	public List<Fornecedor> listarFornecedores(){
		return fornecedorRepository.findAll();
	}
	
	public void excluirFornecedor(Long codForn) {
		fornecedorRepository.deleteById(codForn);
	}

	public Fornecedor buscarPorId(Long codForn) {
		return fornecedorRepository.getOne(codForn);
	}
}
