package Orientação_14_08;

public class Obj_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1= new Animal();
		Animal animal2= new Animal();
		Animal animal3= new Animal();
		Animal animal4= new Animal();
		Animal animal5= new Animal();
		Animal animal6= new Animal();
		Animal animal7= new Animal();
		

		animal1.setRaça("Holstein-Frísia");
		animal1.setCor("malhada");
		animal1.setPeso(580);
		animal1.setIdade(18);

		animal2.setRaça("Holstein-Frísia");
		animal2.setCor("malhada");
		animal2.setPeso(120);
		animal2.setIdade(1);
		
		
		animal3.setRaça("Plymouth");
		animal3.setCor("branca");
		animal3.setPeso(3.25);
		animal3.setIdade(2);
		
		animal4.setRaça("Shih-tzu");
		animal4.setCor("marrom claro");
		animal4.setPeso(4.80);
		animal4.setIdade(3);
		
		
		animal5.setRaça("Pigmeu");
		animal5.setCor("branco");
		animal5.setPeso(20.5);
		animal5.setIdade(2);
		

		
		animal6.setRaça("coelho rex");
		animal6.setCor("marrom");
		animal6.setPeso(2.5);
		animal6.setIdade(3);
		
		animal7.setRaça("Plymouth");
		animal7.setCor("branca");
		animal7.setPeso(0.25);
		animal7.setIdade(1);
		
		
		


		System.out.println("--------VACA---------");
		System.out.println(animal1.getRaça());
		System.out.println(animal1.getIdade());
		System.out.println(animal1.getcor());
		System.out.println(animal1.getpeso());
		System.out.println(animal1.pastar());

		System.out.println("--------BEZERRO---------");
		System.out.println(animal2.getRaça());
		System.out.println(animal2.getIdade());
		System.out.println(animal2.getcor());
		System.out.println(animal2.getpeso());
		System.out.println(animal2.pastar());

		System.out.println("--------GALINHA---------");
		System.out.println(animal2.getRaça());
		System.out.println(animal2.getIdade());
		System.out.println(animal2.getcor());
		System.out.println(animal2.getpeso());
		System.out.println(animal2.ciscar());
		
		
		System.out.println("--------CACHORRO---------");
		System.out.println(animal3.getRaça());
		System.out.println(animal3.getIdade());
		System.out.println(animal3.getcor());
		System.out.println(animal3.getpeso());
		System.out.println(animal3.andar());
		
		System.out.println("--------CABRA---------");
		System.out.println(animal4.getRaça());
		System.out.println(animal4.getIdade());
		System.out.println(animal4.getcor());
		System.out.println(animal4.getpeso());
		System.out.println(animal4.dormir());
		
		System.out.println("--------COELHO---------");
		System.out.println(animal5.getRaça());
		System.out.println(animal5.getIdade());
		System.out.println(animal5.getcor());
		System.out.println(animal5.getpeso());
		System.out.println(animal5.comer());

		System.out.println("--------PINTINHO---------");
		System.out.println(animal7.getRaça());
		System.out.println(animal7.getIdade());
		System.out.println(animal7.getcor());
		System.out.println(animal7.getpeso());
		System.out.println(animal7.ciscar());

	}

}

