
public class Contato {
String Nome;
String Telefone;
String Endereco;


public String getNome() {
	return Nome;
}



public void setNome(String nome) {
	Nome = nome;
}



public String getTelefone() {
	return Telefone;
}



public void setTelefone(String telefone) {
	Telefone = telefone;
}



public String getEndereco() {
	return Endereco;
}



public void setEndereco(String endereco) {
	Endereco = endereco;
}






public Contato (String Nome, String Telefone, String Endereco) {

  this.Nome = Nome;
  this.Telefone = Telefone;
  this.Endereco = Endereco;

}

}
