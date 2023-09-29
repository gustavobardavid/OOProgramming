package models;

public abstract class Cliente {
	private double limiteCredito;
	
	private Endereco endereco;
	
	public Cliente(double limiteCredito, Endereco endereco) {
		super();
		this.limiteCredito = limiteCredito;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
}
