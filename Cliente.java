package Orientação_14_08;

public class Cliente {
	String nome;
	int id;
	int idade;
	String telefone;
	String cpf;
	String rg;
	String endereco;
	String datadenascimento;
	String estadocivil;
	
	public String getnome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone =telefone;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg(){
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDatadenascimento(){
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public String getEstadocivil(){
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String comprar () {
		return "última compra 20/05/2024";
	}
		public String compra () {
			return "comprou hoje às 14H";
	}
	public String pagar () {
		return "pagamento realizado (crédito)";
	}

    public String pago () {
	return "pagamento realizado (PIX)";
}
	public String experimentar () {
		return "experimentou na loja física";
	}
	public String parcelar () {
		return "parcela 3x sem juros";
	}
	public String pesquisar () {
		return "pesquisou pela loja online";
	}
}

