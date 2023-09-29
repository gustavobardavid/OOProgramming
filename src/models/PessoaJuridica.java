package models;

public class PessoaJuridica extends Cliente {
	
	public PessoaJuridica(double limiteCredito, Endereco endereco) {
		super(limiteCredito, endereco);
		// TODO Auto-generated constructor stub
	}
	private String cnpj;
	private String razaoSocial;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
}
