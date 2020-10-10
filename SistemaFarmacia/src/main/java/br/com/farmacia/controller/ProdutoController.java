package br.com.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.farmacia.model.Fornecedor;
import br.com.farmacia.model.Produto;
import br.com.farmacia.services.FornecedorServices;
import br.com.farmacia.services.ProdutoServices;

@Controller
@RequestMapping ("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoServices produtoServices;
	
	@Autowired
	private FornecedorServices fornecedorServices; 
	
	@RequestMapping ("/cadastro")
	public ModelAndView cadastroFornecedor() {
		ModelAndView mv = new ModelAndView("CadastroProduto");
		List<Fornecedor> fornecedores = fornecedorServices.listarFornecedores();
		mv.addObject("listaDeFornecedores", fornecedores);
		mv.addObject("produto", new Produto());
		
		return mv;
	}
	
	@RequestMapping ("/salvar")
	public String salvarProduto(Produto produto) {
		
		produtoServices.cadastrarProduto(produto);
		
		System.out.println("Nome:" + produto.getNomeProd() + produto.getNomeForn());
		return "Home";
	}
	
	@RequestMapping ("/listar")
	public ModelAndView listarProdutos() {
		List<Produto> produtos = produtoServices.listarProdutos();
		ModelAndView mv = new ModelAndView("ListaProdutos");
		mv.addObject("listaDeProdutos", produtos);
		
		return mv;
	}
	
	@RequestMapping ("/excluir/{codProd}")
	public ModelAndView excluirProduto(@PathVariable Long codProd) {
		produtoServices.excluirProduto(codProd);
		ModelAndView mv = new ModelAndView("redirect:/produto/listar");
		return mv;
	}
	
	@RequestMapping ("/editar/{codProd}")
	public ModelAndView editarProduto(@PathVariable Long codProd) {
		Produto produto = produtoServices.buscarPorId(codProd);
		ModelAndView mv = new ModelAndView("CadastroProduto");
		List<Fornecedor> fornecedores = fornecedorServices.listarFornecedores();
		mv.addObject("listaDeFornecedores", fornecedores);
		mv.addObject("produto", produto);
		return mv;
	}
}
