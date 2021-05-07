package com.mv.desafio.service.serviceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mv.desafio.model.Estabelecimento;
import com.mv.desafio.repository.EstabelecimentoRepository;
import com.mv.desafio.service.CnesService;

@Service
public class CnesServiceImpl implements CnesService{
	
	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;
	Map<String,String> estados = new HashMap<>();
	
	

	@Override
	public List<Estabelecimento> findAll() {
		
		return estabelecimentoRepository.findAll();
	}

	@Override
	public List<Estabelecimento> findByTipo(String tipo) {
		
		return estabelecimentoRepository.findByTipo(tipo);

	}

	@Override
	public List<Estabelecimento> findByUf(String uf) {
		
		return estabelecimentoRepository.findByUF(uf);
	
	}

	@Override
	public Estabelecimento findByid(Long id) {
		
		return estabelecimentoRepository.findById(id).get();
	}

	@Override
	public Estabelecimento findByCep(Long cep) {
		
		return estabelecimentoRepository.findByCep(cep);
		
	}

	@Override
	public Estabelecimento save(Estabelecimento estabelecimento) {
		
		return estabelecimentoRepository.save(estabelecimento);
	}

	@Override
	public Map<String, String> getEstados() {
		estados.put("ALAGOAS", "AL");
		estados.put("ACRE", "AC");
		estados.put("AMAPA", "AP");
		estados.put("AMAZONAS", "AM");
		estados.put("BAHIA", "BA");
		estados.put("CEARA", "CE");
		estados.put("ESPIRITO SANTO", "ES");
		estados.put("GOIAS", "GO");
		estados.put("MARANHAO", "MA");
		estados.put("MATO GROSSO", "MT");
		estados.put("MATO GROSSO DO SUL", "MS");
		estados.put("MINAS GERAIS", "MG");
		estados.put("PARA", "PA");
		estados.put("PARAIBA", "PB");
		estados.put("PARANA", "PR");
		estados.put("PERNAMBUCO", "PE");
		estados.put("RIO DE JANEIRO", "RJ");
		estados.put("RIO GRANDE DO NORTE", "RN");
		estados.put("RIO GRANDE DO SUL", "RS");
		estados.put("RONDONIA", "RO");
		estados.put("RORAIMA", "RR");
		estados.put("SANTA CATARINA", "SC");
		estados.put("SAO PAULO", "SP");
		estados.put("SERGIPE", "SE");
		estados.put("TOCANTINS", "TO");
		estados.put("DISTRITO FEDERAL", "DF");
		return estados;
	}

}
