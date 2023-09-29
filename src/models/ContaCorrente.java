package models;

import java.time.LocalDate;

public class ContaCorrente extends Conta{
	
	

	public ContaCorrente(String agencia, int numConta, Double saldo, LocalDate dtAbertura, Cliente cliente,
			Double txManutencao) {
		super(agencia, numConta, saldo, dtAbertura, cliente);
		this.txManutencao = txManutencao;
	}

	private Double txManutencao;
	
	public Double getTxManutencao() {
		return txManutencao;
	}

	public void setTxManutencao(Double txManutencao) {
		this.txManutencao = txManutencao;
	}

	public boolean aplicarTx(){
		saldo = saldo - txManutencao;
		return true;
	}


}
