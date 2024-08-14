package Orientação_14_08;

public class Obj_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1= new Cliente();
		Cliente cliente2= new Cliente();
		
		
		cliente1.setNome("Janaína");
		cliente1.setId(320199);
		cliente1.setIdade(36);
		cliente1.setTelefone("(15)99684-8653");
		cliente1.setEndereco("Rua Maria Euclídes,n°44");
		cliente1.setRg("300.553.200.21");
		cliente1.setCpf("310.987.345-18");
		cliente1.setDatadenascimento("10/09/1986");
		cliente1.setEstadocivil("solteira");
	
	

	cliente2.setNome("Fábio");
	cliente2.setId(53092459);
	cliente2.setIdade(40);
	cliente2.setTelefone("(15)99684-8653");
	cliente2.setEndereco("Rua Getúlio Vargas,centro,n°180");
	cliente2.setRg("210.553.200.21");
	cliente2.setCpf("430.987.345-18");
	cliente2.setDatadenascimento("10/09/1983");
	cliente2.setEstadocivil("casado");
	
	
	System.out.println("--------------------------------");
	System.out.println(cliente1.getnome());
	System.out.println(cliente1.getDatadenascimento());
	System.out.println(cliente1.getId());
	System.out.println(cliente1.getTelefone());
	System.out.println(cliente1.getCpf());
	System.out.println(cliente1.getRg());
	System.out.println(cliente1.getEndereco());
	System.out.println(cliente1.getEstadocivil());
	System.out.println("*****************************");
	System.out.println(cliente1.pesquisar());
	System.out.println(cliente1.comprar());
	System.out.println(cliente1.pago());
	
	
	System.out.println("--------------------------------");
	System.out.println(cliente2.getnome());
	System.out.println(cliente2.getDatadenascimento());
	System.out.println(cliente2.getId());
	System.out.println(cliente2.getTelefone());
	System.out.println(cliente2.getCpf());
	System.out.println(cliente2.getRg());
	System.out.println(cliente2.getEndereco());
	System.out.println(cliente2.getEstadocivil());
	System.out.println("*****************************");
	System.out.println(cliente2.compra());
	System.out.println(cliente2.pagar());
	System.out.println(cliente2.parcelar());
	System.out.println(cliente2.experimentar());
	
}
}
