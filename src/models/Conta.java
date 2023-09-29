package models;

import java.time.LocalDate;

public abstract class Conta {
	
	private String agencia;
	private int numConta;
	protected Double saldo;
	private LocalDate dtAbertura;
	
	private Cliente cliente;
	
	public Conta(String agencia, int numConta, Double saldo, LocalDate dtAbertura, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
		this.dtAbertura = dtAbertura;
		this.cliente = cliente;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public LocalDate getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(LocalDate dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	
	public boolean sacar(Double valor) {
		if(valor < saldo) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
	
	public boolean depositar(Double valor) {
		if(valor == null) {
			return false;
		} else {
			saldo+=valor;
			return true;
		}
	}
	
}
