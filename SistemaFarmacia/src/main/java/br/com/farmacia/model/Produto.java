package br.com.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codProd;
	
	private String nomeProd;
	private String tipoProd;
	private String marcaProd;
	private int qtdProd;
	private String nomeForn;
	
	public Long getCodProd() {
		return codProd;
	}
	public void setCodProd(Long codProd) {
		this.codProd = codProd;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public String getTipoProd() {
		return tipoProd;
	}
	public void setTipoProd(String tipoProd) {
		this.tipoProd = tipoProd;
	}
	public String getMarcaProd() {
		return marcaProd;
	}
	public void setMarcaProd(String marcaProd) {
		this.marcaProd = marcaProd;
	}
	public int getQtdProd() {
		return qtdProd;
	}
	public void setQtdProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}
	public String getNomeForn() {
		return nomeForn;
	}
	public void setNomeForn(String nomeForn) {
		this.nomeForn = nomeForn;
	}

}
