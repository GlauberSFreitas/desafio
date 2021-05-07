package com.mv.desafio.service;
import java.util.List;
import java.util.Map;

import com.mv.desafio.model.Estabelecimento;
public interface CnesService {
	
List<Estabelecimento> findAll();
List<Estabelecimento> findByTipo(String tipo);
List<Estabelecimento> findByUf(String uf);
Estabelecimento findByid(Long id);
Estabelecimento findByCep(Long cep);
Estabelecimento save(Estabelecimento estabelecimento);
Map<String, String>getEstados();

}
