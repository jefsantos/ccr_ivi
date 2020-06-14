package com.ivi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ivi.repository.CoordenadasRepository;

@Controller
@RequestMapping(name="/rotas")
public class BuscarRotas {
	
	
	
	@Autowired
	CoordenadasRepository coordenadaRepository;
	
	
	
	/**
	 * 
	 * 
	 * @param pontos, Veiculos, eixo, combustivel, consumo, paradas, token
	 * @return 
	 * @return
	 */
	@GetMapping(value="/busca/{id_Coordenada}")
	public @ResponseBody <Coordenadas> Object buscarRotas(@PathVariable("id_Coordenada")int id_Coordenada){
		return coordenadaRepository.findById((id_Coordenada));
		
	}





}
