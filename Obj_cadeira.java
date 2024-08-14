package Orientação_14_08;

public class Obj_cadeira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadeira cadeira1= new Cadeira();
		Cadeira cadeira2= new Cadeira();
		
		cadeira1.setModelo("Fresh");
		cadeira1.setCor("preta");
		cadeira1.setMaterial("couro");
		cadeira1.setCapacidadedepeso(150);
		cadeira1.setValor(389.90);
		
		cadeira2.setModelo("Fresh");
		cadeira2.setCor("marrom");
		cadeira2.setMaterial("couro");
		cadeira2.setCapacidadedepeso(100);
		cadeira2.setValor(265.50);
		
		System.out.println("--------------------------------");
		System.out.println(cadeira1.getModelo());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getCaapacidadedepeso());
		System.out.println(cadeira1.getcor());
		System.out.println(cadeira1.getValor());
		System.out.println(cadeira1.aumentar());
		System.out.println(cadeira1.deitar());

		System.out.println("--------------------------------");
		System.out.println(cadeira2.getModelo());
		System.out.println(cadeira2.getMaterial());
		System.out.println(cadeira2.getCaapacidadedepeso());
		System.out.println(cadeira2.getcor());
		System.out.println(cadeira2.getValor());
		System.out.println(cadeira2.girar());
		System.out.println(cadeira2.mover());

	}

}
