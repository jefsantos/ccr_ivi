package com.ivi.services;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ApiRotasBrasil {
	
	private static String URLBase = "http://rotasbrasil.com.br/apiRotas/coordenadas/?pontos=-50.1601812,-25.0891685;-49.2712724,-25.4295963&veiculo=auto&eixo=2&token={SeuToken}&paradas=true";
	
	private static String token="xxxxxxxxxxxx";
	private static ApiRotasBrasil instance;

	private CloseableHttpClient clientHTTP;
	
	private ApiRotasBrasil() {
		this.clientHTTP = HttpClients.createDefault();
	}
	
	public static ApiRotasBrasil getInstance() {
		if(instance == null) {
			instance = new ApiRotasBrasil();
		}
		
		return instance;
		
	}
	
	
	public void doLogin() {
		
		HttpPost httpPost  = new HttpPost(ApiRotasBrasil.URLBase);
		
//		try {
//			
//		}catch{
//			
//		}
		
		
		
		
		
	}
	
	
	
	
}
