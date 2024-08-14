package Orientação_14_08;

public class Cadeira {
	String modelo;
	int capacidadedepeso;
	String cor;
	String material;
	double valor;

public int getCaapacidadedepeso() {
	return capacidadedepeso;
}
public void setCapacidadedepeso(int capacidadedepeso) {
	this.capacidadedepeso = capacidadedepeso;
}
public String getcor(){
	return cor;
}
public void setCor(String cor) {
	this.cor =cor;
}
public String getMaterial(){
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getModelo(){
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public double getValor(){
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String girar(){
	return "Pode girar";
}
public String deitar() {
	return "Possui inclinação";
}
public String mover() {
	return "Move-se com as rodas";
}
public String aumentar() {
	return "Pode-se regular a altura da cadeira";
}
}
