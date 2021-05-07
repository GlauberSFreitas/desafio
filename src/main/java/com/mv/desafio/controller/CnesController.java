package com.mv.desafio.controller;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mv.desafio.model.Estabelecimento;
import com.mv.desafio.service.CnesService;

@Controller
public class CnesController {

	@Autowired
	CnesService cnesService;
	
	
	
	

	@GetMapping(value = "/index") 
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("/index");
		List<Estabelecimento> cnes = cnesService.findAll();
		mv.addObject("data", cnes);
		return mv;
	}
	
	@PostMapping(value = "**/pesquisartodos") 
	public ModelAndView getEstabelecimentos() {
		ModelAndView mv = new ModelAndView("/index");
		List<Estabelecimento> cnes = cnesService.findAll();
		mv.addObject("data", cnes);
		return mv;
	}
	
	@PostMapping(value = "**/pesquisartipo") 
	public ModelAndView buscarTipo(@RequestParam("tipo")String tipo) {
		ModelAndView mv = new ModelAndView("/index");
		List<Estabelecimento> cnes = cnesService.findByTipo(tipo.toUpperCase());
		mv.addObject("data", cnes);
		return mv;
	}
	
	@PostMapping(value = "**/pesquisaruf") 
	public ModelAndView buscarUf(@RequestParam("uf")String uf) {
		ModelAndView mv = new ModelAndView("/index");
		 
		String ufEstado = cnesService.getEstados().
									  get(Normalizer.normalize(uf, Normalizer.Form.NFD)
									  .replaceAll("[^\\p{ASCII}]", "")
									  .toUpperCase());
		if(ufEstado==null)
			ufEstado= uf.toUpperCase();
		List<Estabelecimento> cnes = cnesService.findByUf(ufEstado);
		mv.addObject("data", cnes);
		return mv;
	}
	
	@PostMapping(value = "**/pesquisarcep") 
	public ModelAndView buscarCep(@RequestParam("cep")String cep) {
		ModelAndView mv = new ModelAndView("/index");
		List<Estabelecimento> cnes = new ArrayList<>();
		cnes.add(cnesService.findByCep(Long.valueOf(cep)));
		mv.addObject("data", cnes);
		return mv;
	}

	


	
	
}
