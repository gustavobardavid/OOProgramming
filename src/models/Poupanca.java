package models;

import java.time.LocalDate;

public class Poupanca extends Conta {
	
	public Poupanca(String agencia, int numConta, Double saldo, LocalDate dtAbertura, Cliente cliente) {
		super(agencia, numConta, saldo, dtAbertura, cliente);
		// TODO Auto-generated constructor stub
	}

	private Double txJuros;

	public Double getTxJuros() {
		return txJuros;
	}

	public void setTxJuros(Double txJuros) {
		this.txJuros = txJuros;
	}
	
	public boolean renderJuros() {
		saldo += saldo * txJuros;
		return true;
	}
}
