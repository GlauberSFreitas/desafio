package com.mv.desafio.utils;

public class CsvEstabelecimento {
private String co_cnes;
private String co_ibge;
private String no_fantasia;
private String ds_tipo_unidade;
private String tp_gestao;
private String no_logradouro;
private String nu_endereco;
private String no_bairro;
private String co_cep;
private String uf;
private String municipio;
private String nu_telefone;
public String getCo_cnes() {
	return co_cnes;
}
public void setCo_cnes(String co_cnes) {
	this.co_cnes = co_cnes;
}
public String getCo_ibge() {
	return co_ibge;
}
public void setCo_ibge(String co_ibge) {
	this.co_ibge = co_ibge;
}
public String getNo_fantasia() {
	return no_fantasia;
}
public void setNo_fantasia(String no_fantasia) {
	this.no_fantasia = no_fantasia;
}
public String getDs_tipo_unidade() {
	return ds_tipo_unidade;
}
public void setDs_tipo_unidade(String ds_tipo_unidade) {
	this.ds_tipo_unidade = ds_tipo_unidade;
}
public String getTp_gestao() {
	return tp_gestao;
}
public void setTp_gestao(String tp_gestao) {
	this.tp_gestao = tp_gestao;
}
public String getNo_logradouro() {
	return no_logradouro;
}
public void setNo_logradouro(String no_logradouro) {
	this.no_logradouro = no_logradouro;
}
public String getNu_endereco() {
	return nu_endereco;
}
public void setNu_endereco(String nu_endereco) {
	this.nu_endereco = nu_endereco;
}
public String getNo_bairro() {
	return no_bairro;
}
public void setNo_bairro(String no_bairro) {
	this.no_bairro = no_bairro;
}
public String getCo_cep() {
	return co_cep;
}
public void setCo_cep(String co_cep) {
	this.co_cep = co_cep;
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
public String getNu_telefone() {
	return nu_telefone;
}
public void setNu_telefone(String nu_telefone) {
	this.nu_telefone = nu_telefone;
}
@Override
public String toString() {
	return "CsvEstabelecimento [co_cnes=" + co_cnes + ", co_ibge=" + co_ibge + ", no_fantasia=" + no_fantasia
			+ ", ds_tipo_unidade=" + ds_tipo_unidade + ", tp_gestao=" + tp_gestao + ", no_logradouro=" + no_logradouro
			+ ", nu_endereco=" + nu_endereco + ", no_bairro=" + no_bairro + ", co_cep=" + co_cep + ", uf=" + uf
			+ ", municipio=" + municipio + ", nu_telefone=" + nu_telefone + "]";
}



}
