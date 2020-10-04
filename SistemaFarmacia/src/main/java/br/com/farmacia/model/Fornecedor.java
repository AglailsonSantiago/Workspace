package br.com.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToMany(mappedBy="codForn")
	private Long codForn;
	
	private String nomeForn;
	private String telefone1;
	private String telefone2;
	
	@OneToMany(mappedBy="codForn", cascade = CascadeType.ALL)
	private List<Produto> produtos;
	
	
	public Long getCodForn() {
		return codForn;
	}
	public void setCodForn(Long codForn) {
		this.codForn = codForn;
	}
	public String getNomeForn() {
		return nomeForn;
	}
	public void setNomeForn(String nomeForn) {
		this.nomeForn = nomeForn;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	
}
