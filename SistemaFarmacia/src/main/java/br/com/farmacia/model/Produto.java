package br.com.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codProd;
	
	private String nomeProd;
	private String tipoProd;
	private String marcaProd;
	private Double precoProd;
	private int qtdProd;
	
	@ManyToOne
	@JoinColumn(name="codForn")
	private Fornecedor codForn;
	
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
	public Double getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(Double precoProd) {
		this.precoProd = precoProd;
	}
	public int getQtdProd() {
		return qtdProd;
	}
	public void setQtdProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}

}
