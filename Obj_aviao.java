package Orientação_14_08;


public class Obj_aviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avião avião1= new Avião();


		avião1.setNome("Avião executivo");
		avião1.setCapacidade(350);
		avião1.setEmpresa("Gool");
		avião1.setCor("laranja");








		System.out.println("-----------------");
		System.out.println(avião1.getnome());
		System.out.println(avião1.getCaapacidade());
		System.out.println(avião1.getEmpresa());
		System.out.println(avião1.getcor());
		System.out.println(avião1.planar());

	}

}

