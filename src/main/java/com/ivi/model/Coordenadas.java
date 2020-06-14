package com.ivi.model;

import javax.persistence.Entity;





@Entity
public class Coordenadas {

	int id_Coordenada;
	String veiculo;
	String eixo;
	float combustivel;
	float consumo;
	float paradas;
	
	
	

	public int getId_Coordenada() {
		return id_Coordenada;
	}

	public void setId_Coordenada(int id_Coordenada) {
		this.id_Coordenada = id_Coordenada;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getEixo() {
		return eixo;
	}

	public void setEixo(String eixo) {
		this.eixo = eixo;
	}

	public float getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public float getParadas() {
		return paradas;
	}

	public void setParadas(float paradas) {
		this.paradas = paradas;
	}

}
