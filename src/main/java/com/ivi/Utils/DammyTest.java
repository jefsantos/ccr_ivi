package com.ivi.Utils;

import com.ivi.services.ApiRotasBrasil;

public class DammyTest {

	public static void main(String[] args) {
		
		ApiRotasBrasil api =  ApiRotasBrasil.getInstance();
		
		api.doLogin();
		
		System.out.println(api.doRequest("Posicao"));
		
	
		


	}

}
