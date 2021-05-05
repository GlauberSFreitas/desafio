package com.mv.desafio.service.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mv.desafio.model.Estabelecimento;
import com.mv.desafio.repository.EstabelecimentoRepository;
import com.mv.desafio.service.CnesService;

@Service
public class CnesServiceImpl implements CnesService{
	
	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;

	@Override
	public List<Estabelecimento> findAll() {
		
		return estabelecimentoRepository.findAll();
	}

	@Override
	public List<Estabelecimento> findByTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estabelecimento> findByUf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estabelecimento findByid(Long id) {
		
		return estabelecimentoRepository.findById(id).get();
	}

	@Override
	public Estabelecimento findByCep(Long cep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estabelecimento save(Estabelecimento estabelecimento) {
		
		return estabelecimentoRepository.save(estabelecimento);
	}

}
