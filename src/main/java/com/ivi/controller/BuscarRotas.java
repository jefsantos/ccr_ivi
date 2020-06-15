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
//	@GetMapping(value="/acinaPanico")
//	public @ResponseBody <Coordenadas> Object buscarRotas(@PathVariable("id_numerosTel")int id_numerosTel){
//		aletaPanico api_panico =  aletaPanico.getInstance();
//		api.doLogin();
//		geoLoc.setlocation = new Coordenadas();
//		return responseEntity.body().ok
//		
//	}
	
//	@Autowired
//	CodePanicFemaleService codePanicFemaleService; 
//	
//	
//@RequestMapping(value="/index", method = RequestMethod.GET)
//	public ModelAndView getIndex() {
//		ModelAndView mv = new ModelAndView("services");
//		List<CodePanicFemaleService> codePanicFemaleService = BaseServices();
//		
//		mv.addObject("services", service);
//		
//		return mv;
//	}
//

//	@Autowired
//	CodePanicFemaleService codePanicFemaleService; 
//	
//	
//@RequestMapping(value="/routSecurity", method = RequestMethod.GET)
//	public ModelAndView getIndex() {
//		ModelAndView mv = new ModelAndView("routes");
//		List<chooseRouts> cr = BaseServices
//		
//		mv.addObject("services", cr);
//		
//		return mv;
//	}	
	
	




}
