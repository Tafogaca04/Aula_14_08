package Orientação_14_08;

public class Avião {
	String nome;
	int capacidade;
	String cor;
	String empresa;
	
	public String getnome(){
	return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCaapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getcor(){
		return cor;
	}
	public void setCor(String cor) {
		this.cor =cor;
	}
	public String getEmpresa(){
		 return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String decolar () {
		return "decolar";
	}
	public String voar () {
		return "voando";
	}
		public String planar () {
			return "planando";
}
}

