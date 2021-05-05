package com.mv.desafio.model;

import javax.persistence.*;
@Entity
@Table(name="TB_CNESATIVOS")
public class Estabelecimento {
	@Id
	private Long codCnes; 
	
	private Long codIbge;
	
	private String nomeFantasia;
	
	private String tipoUnidade;
	
	private String gestao;
	
	private String logradouro;
	
	private String numero;
	
	private String bairro;
	
	private Long cep;
	
	private String uf;
	
	private String municipio;
	
	private String telefone;

	public Long getCodCnes() {
		return codCnes;
	}

	public void setCodCnes(Long codCnes) {
		this.codCnes = codCnes;
	}

	public Long getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(Long codIbge) {
		this.codIbge = codIbge;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public String getGestao() {
		return gestao;
	}

	public void setGestao(String gestao) {
		this.gestao = gestao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Estabelecimento() {
	}

	public Estabelecimento(Long codIbge, String nomeFantasia, String tipoUnidade, String gestao, String logradouro,
			String numero, String bairro, Long cep, String uf, String municipio, String telefone) {
		super();
		this.codIbge = codIbge;
		this.nomeFantasia = nomeFantasia;
		this.tipoUnidade = tipoUnidade;
		this.gestao = gestao;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.uf = uf;
		this.municipio = municipio;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Estabelecimento [codCnes=" + codCnes + ", codIbge=" + codIbge + ", nomeFantasia=" + nomeFantasia
				+ ", tipoUnidade=" + tipoUnidade + ", gestao=" + gestao + ", logradouro=" + logradouro + ", numero="
				+ numero + ", bairro=" + bairro + ", cep=" + cep + ", uf=" + uf + ", municipio=" + municipio
				+ ", telefone=" + telefone + "]";
	}
	
	
	
}
