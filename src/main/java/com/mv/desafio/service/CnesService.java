package com.mv.desafio.service;
import java.util.List;

import com.mv.desafio.model.Estabelecimento;
public interface CnesService {
	
List<Estabelecimento> findAll();
List<Estabelecimento> findByTipo();
List<Estabelecimento> findByUf();
Estabelecimento findByid(Long id);
Estabelecimento findByCep(Long cep);
Estabelecimento save(Estabelecimento estabelecimento);
}
