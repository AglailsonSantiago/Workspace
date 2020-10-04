package br.com.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.farmacia.model.Fornecedor;
import br.com.farmacia.services.FornecedorServices;

@Controller
@RequestMapping ("/fornecedor")
public class FornecedorController {
	
	@Autowired
	private FornecedorServices fornecedorServices; 
	 
	@RequestMapping ("/cadastro")
	public ModelAndView cadastroFornecedor() {
		ModelAndView mv = new ModelAndView("CadastroFornecedor");
		mv.addObject("fornecedor", new Fornecedor());
		return mv;
	}
	
	@RequestMapping ("/salvar")
	public String salvarFornecedor(Fornecedor fornecedor) {
		
		fornecedorServices.cadastrarFornecedor(fornecedor);
		
		System.out.println("Nome:" + fornecedor.getNomeForn());
		return "Home";
	}
	
	@RequestMapping ("/listar")
	public ModelAndView listarFornecedores() {
		List<Fornecedor> fornecedores = fornecedorServices.listarFornecedores();
		ModelAndView mv = new ModelAndView("ListaFornecedores");
		mv.addObject("listaDeFornecedores", fornecedores);
		
		return mv;
	}
	
	@RequestMapping ("/excluir/{codForn}")
	public ModelAndView excluirFornecedor(@PathVariable Long codForn) {
		fornecedorServices.excluirFornecedor(codForn);
		ModelAndView mv = new ModelAndView("redirect:/fornecedor/listar");
		return mv;
	}
	
	@RequestMapping ("/editar/{codForn}")
	public ModelAndView editarFornecedor(@PathVariable Long codForn) {
		Fornecedor fornecedor = fornecedorServices.buscarPorId(codForn);
		ModelAndView mv = new ModelAndView("CadastroFornecedor");
		mv.addObject("fornecedor", fornecedor);
		return mv;
	}

}
