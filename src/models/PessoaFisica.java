package models;

import java.time.LocalDate;

public class PessoaFisica extends Cliente{

	public PessoaFisica(double limiteCredito, Endereco endereco, String cpf, String nome, LocalDate dtNasc) {
		super(limiteCredito, endereco);
		this.cpf = cpf;
		this.nome = nome;
		this.dtNasc = dtNasc;
	}
	private String cpf;
	private String nome;
	private LocalDate dtNasc;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}
	
}
