package redesocial;

import java.util.List;
import java.util.Scanner;

public class Usuario {
	
	private String Nome;
	private String Email;
	private String Senha;
	public List<String> ListaPostagem;
	public List<Usuario> ListaAmigos;
	
	public Usuario(String Nome, String Email, String Senha){
		this.Nome = Nome;
		this.Email = Email;
		this.Senha = Senha;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public List<String> getListaPostagem() {
		return ListaPostagem;
	}
	public void setListaPostagem(List<String> listaPostagem) {
		ListaPostagem = listaPostagem;
	}
	
	public void logar() {
	
	}
	public void deslogar() {

	}
	
	public void novaPostagem () {
		System.out.println("Escreva o que você está pensando. ");
		Scanner teclado = new Scanner (System.in);
		String postagem = teclado.nextLine();
		ListaPostagem.add(postagem);
	}
	public void listarPostagens () {
		for (String postagem : ListaPostagem) {
			System.out.println(postagem);
		}
		
	}
	public void listarAmizades() {
		for (Usuario amigo : ListaAmigos) {
			System.out.println("Nome " + amigo.getNome());
		}
	}
	
	public void destruirAmizade() {
		listarAmizades();
		System.out.println("Digite o nome do amigo que deseja desfazer amizade. ");
		Scanner teclado = new Scanner (System.in);
	}
	
	
	
	
	
	


}