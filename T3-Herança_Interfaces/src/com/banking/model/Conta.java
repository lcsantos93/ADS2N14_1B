package com.banking.model;

public class Conta {

	double saldo;
	int numConta;
	int numVerficacao;
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the numConta
	 */
	public int getNumConta() {
		return numConta;
	}
	/**
	 * @param numConta the numConta to set
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	/**
	 * @return the numVerficacao
	 */
	public int getNumVerficacao() {
		return numVerficacao;
	}
	/**
	 * @param numVerficacao the numVerficacao to set
	 */
	public void setNumVerficacao(int numVerficacao) {
		this.numVerficacao = numVerficacao;
	}
	
	public void saque (double valor){
		if(valor<=this.saldo){
		this.saldo = this.saldo-valor;
		}
	}
}
