package com.ivi.services;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Entity;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ApiRotasBrasil {

	private static String URLBase = "http://rotasbrasil.com.br/apiRotas/coordenadas/?pontos=-50.1601812,-25.0891685;-49.2712724,-25.4295963&veiculo=auto&eixo=2&token=";

	private static String token = "8a031d90c9d8819656a9a2046bc71b2e";
	private static ApiRotasBrasil instance;

	private CloseableHttpClient clientHTTP;

	private ApiRotasBrasil() {
		this.clientHTTP = HttpClients.createDefault();
	}

	public static ApiRotasBrasil getInstance() {
		if (instance == null) {
			instance = new ApiRotasBrasil();
		}

		return instance;

	}

	public void doLogin() {
		try {
			System.out.println(ApiRotasBrasil.URLBase+token+"&paradas=true");
		HttpPost httpPost  = new HttpPost(ApiRotasBrasil.URLBase+token+"&paradas=true");

		
		ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

			@Override
			public String handleResponse(
					final HttpResponse response) throws ClientProtocolException, IOException {
				int status = response.getStatusLine().getStatusCode();
				if(status >= 200 && status < 300) {
					
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity) :null;
					
				}else {
					throw new ClientProtocolException("Unexpected response status:"+ status);
				}
			
			}
			
		};
		
		String responseBody = this.clientHTTP.execute(httpPost, responseHandler);
		System.out.println("--------------------------------------------");
		System.out.println(responseBody);
		
	}catch(IOException ex){
		
		Logger.getLogger(ApiRotasBrasil.class.getName()).log(Level.SEVERE, null, ex);
	}
	}
	

	public String doRequest (String path) {
			String responseBody = null;
			try {
				HttpGet httpGet = new  HttpGet(URLBase+token+"&paradas=true");
				
				ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

					@Override
					public String handleResponse(
							final HttpResponse response) throws ClientProtocolException, IOException {
						int status = response.getStatusLine().getStatusCode();
						if(status >= 200 && status < 300) {
							
							HttpEntity entity = response.getEntity();
							return entity != null ? EntityUtils.toString(entity) :null;
							
						}else {
							throw new ClientProtocolException("Unexpected response status:"+ status);
						}
					}
					
					
				};
				
				
				responseBody = this.clientHTTP.execute(httpGet, responseHandler);
				System.out.println("----------------------------------------------");
				
				
				
			}catch (IOException ex) {
				Logger.getLogger(ApiRotasBrasil.class.getName()).log(Level.SEVERE, null,ex);
			}
			
			return responseBody;
		}

}


