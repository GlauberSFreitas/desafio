package com.mv.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mv.desafio.model.Estabelecimento;
import com.mv.desafio.service.CnesService;

@Controller
public class CnesController {

	@Autowired
	CnesService cnesService;
	
	@GetMapping(value = "/index") 
	public ModelAndView getEstabelecimentos() {
		ModelAndView mv = new ModelAndView("data");
		List<Estabelecimento> cnes = cnesService.findAll();
		mv.addObject("data", cnes);
		return mv;
	}
	
}
