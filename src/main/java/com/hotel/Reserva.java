package com.hotel;

public class Reserva {
	private String nome;
	private String tipoQ;
	private int numDias;
	private double valor;

	public Reserva (String nome, String tipoQ, int numDias,  double valor) {
		this.nome = nome;
		this.tipoQ = tipoQ;
		this.numDias = numDias;
		this.valor = valor;
	}

	public Reserva (String nome, String tipoQ){
		this.nome = nome;
		this.tipoQ = tipoQ;
		this.numDias = 1;
		this.valor = 0.0;
	}


	public double calcularValorTotal(){
		return this.numDias * this.valor;
	}

	public String getNome() {
	    return nome;
	}

	public void setNome(String nome) {
	    this.nome = nome;
	}

	public String getTipoQ() {
	    return tipoQ;
	}

	public void setTipoQ(String tipoQ) {
	    this.tipoQ = tipoQ;
	}

	public int getNumDias() {
	    return numDias;
	}

	public void setNumDias(int numDias) {
	    this.numDias = numDias;
	}

	public double getValor() {
	    return valor;
	}

	public void setValor(double valor) {
	    this.valor = valor;
	}

	@Override
	public String toString() {
    		return "Hóspede: " + nome +
	           	" | Quarto: " + tipoQ +
        	   	" | Dias: " + numDias +
           		" | Total: R$" + String.format("%.2f", calcularValorTotal());
	}

}
