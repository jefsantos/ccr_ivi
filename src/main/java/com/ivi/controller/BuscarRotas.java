package com.ivi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivi.services.ApiRotasBrasil;

@RestController
@RequestMapping("/rotas")
public class BuscarRotas {
	
	
	
	@GetMapping("/calculaRota")
	public String findRout() {
		
		ApiRotasBrasil api =  ApiRotasBrasil.getInstance();
		
		api.doLogin();
		
		System.out.println(api.doRequest("Posicao"));
		return (api.doRequest("posição"));
	}
	
//	
//	@Autowired
//	CoordenadasRepository coordenadaRepository;
	
	
	
	/**
	 * 
	 * 
	 * @param pontos, Veiculos, eixo, combustivel, consumo, paradas, token
	 * @return 
	 * @return
	 */
//	@GetMapping(value="/busca")
//	public @ResponseBody <Coordenadas> Object buscarRotas(@PathVariable("id_Coordenada")int id_Coordenada){
//		ApiRotasBrasil api =  ApiRotasBrasil.getInstance();
//		api.doLogin();
//		System.out.println(api.doRequest("Posicao"));
//		return coordenadaRepository.findById((id_Coordenada));
//		
//	}


	
	
	




}
