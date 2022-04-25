package model.entities;

import model.exceptions.DomainException;

public class Conta {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Conta() {
	}
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public double deposito(double quantidade) {
		return saldo = saldo + quantidade;
	}
	
	public double saque(double quantidade) {
		validadeDeSaque(quantidade);
		 return saldo = saldo - quantidade;
		}
	
	private void validadeDeSaque(double quantidade) {
		
		if(quantidade > getLimiteDeSaque()) {
			throw new DomainException("Erro de saque: O valor excede o limite de saque");
		}
		if (quantidade > getSaldo()) {
			throw new DomainException("Erro de saque: Saldo Insuficiente ");
		}
	}
	
	@Override
	public String toString() {
		return "Novo saldo: "
				+ String.format("%.2f", saldo);
	}
	
}
