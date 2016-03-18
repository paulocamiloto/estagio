package br.sceweb.modelo;

public class Empresa {
	String cnpj;
	String NomeDaEmpresa;
	String NomeFantasia;
	String endereco;
	String telefone;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeDaEmpresa() {
		return NomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		NomeDaEmpresa = nomeDaEmpresa;
	}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
