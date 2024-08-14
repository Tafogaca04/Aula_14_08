package Orientação_14_08;

public class Animal {
	String raça;
	int idade;
	String cor;
	double peso;
	
	public String getRaça(){
	return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getcor(){
		return cor;
	}
	public void setCor(String cor) {
		this.cor =cor;
	}
	public double getpeso(){
		 return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String pastar () {
		return "pastando";
	}
	public String andar () {
		return "andando";
}
	public String dormir () {
		return "dormindo";
	}
	public String comer () {
		return "comendo";
	}
	public String ciscar () {
		return "ciscando";
}
}
