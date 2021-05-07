package com.mv.desafio.utils;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mv.desafio.model.Estabelecimento;
import com.mv.desafio.repository.EstabelecimentoRepository;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Component
public class PopularBanco {

	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;
	private List<Estabelecimento> estList = new ArrayList<>();

	// @PostConstruct
	public void salvar() throws IOException, URISyntaxException {

		Reader reader = Files
				.newBufferedReader(Paths.get(ClassLoader.getSystemResource("cnes_ativonone.csv.csv").toURI()));
		CsvToBean<CsvEstabelecimento> csvToBean = new CsvToBeanBuilder(reader).withType(CsvEstabelecimento.class)
				.build();
		List<CsvEstabelecimento> estCsv = csvToBean.parse();

		for (CsvEstabelecimento e : estCsv) {
			Estabelecimento est = new Estabelecimento();
			est.setCodCnes(Long.valueOf(e.getCo_cnes()));
			est.setCodIbge(Long.valueOf(e.getCo_ibge()));
			est.setNomeFantasia(e.getNo_fantasia());
			est.setTipoUnidade(e.getDs_tipo_unidade());
			est.setGestao(e.getTp_gestao());
			est.setLogradouro(e.getNo_logradouro());
			est.setNumero(e.getNu_endereco());
			est.setBairro(e.getNo_bairro());
			est.setCep(Long.valueOf(e.getCo_cep()));
			est.setUf(e.getUf());
			est.setMunicipio(e.getMunicipio());
			est.setTelefone(e.getNu_telefone());
			estList.add(est);
		}

		for (Estabelecimento e : estList) {
			Estabelecimento saved = estabelecimentoRepository.save(e);
			System.out.println(saved.getId() + "OK");
		}
	}

}
