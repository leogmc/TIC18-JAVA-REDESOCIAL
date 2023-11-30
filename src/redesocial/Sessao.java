package redesocial;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Sessao {
    private Usuario usuario;
    private Calendar inicio;
    private Calendar fim;

    public Sessao(Usuario usuario) {
        this.usuario = usuario;
        this.inicio = Calendar.getInstance();
    }

    public void setFim() {
        this.fim = Calendar.getInstance();
    }
    
    public void autenticar(List<Usuario> usuarios) {
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("Digite o nome. ");
    	String nome = entrada.nextLine();
    	
    	System.out.println("Digite a senha. ");
    	String senha = entrada.nextLine();
    	
    	entrada.close();
    	
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
            	System.out.println("Logado com sucesso");
            	menuSessao();
            }
        }
        System.out.println("Erro no login");
    }

    public void criarAmizade(List<Usuario> usuarios) {
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("Digite o nome do amigo para adicionar. ");
    	String amigo = entrada.nextLine();
    	entrada.close();
    	
    	for (Usuario usuario : usuarios) {
    		 if (usuario.getNome().equalsIgnoreCase(amigo)) {
    			 this.usuario.ListaAmigos.add(usuario);
    			 usuario.ListaAmigos.add(usuario);
    			 return;
    		 }
		}
    	
    	System.out.println("Usuário não está na rede.");
    }

    public void desfazerAmizade(List<Usuario> usuarios) {
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("Digite o nome do amigo para adicionar. ");
    	String amigo = entrada.nextLine();
    	entrada.close();
    	
        
    }

    public void incluirPostagem(String postagem) {
        listaPostagens.add(postagem);
        System.out.println("Postagem adicionada por " + this.nome + ": " + postagem);
    }

    private Usuario encontrarUsuario(String nomeUsuario, ArrayList<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNome().equals(nomeUsuario)) {
                return usuario;
            }
        }
        return null;
    }
}
