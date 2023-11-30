package redesocial;

import java.util.List;
import java.util.Scanner;

public class Program {
	
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			List<Usuario> usuariosDaRede = new List<Usuario>();

			int opcao;
			
			do {
			System.out.println("--------- | MENU DO USUÁRIO | --------- ");
			System.out.println("");

			System.out.println("[1] - Novo usuário \n[2] - Remover usuário \n[3] - Logar \n[0] - Sair.");
			System.out.println("O que deseja realizar?: ");
			opcao = scanner.nextInt();

			
			switch (opcao) {

			case 1:
				// criarUsuario(usuario);
				break;
				
			case 2:
				// removerUsuario(usuario); 
				break;
				
			case 3:
				// logar();
				// menuSessao();
				break;

			case 0:
				System.out.println("Saindo... Até a próxima!");
				System.exit(0);
				
			default:
				System.out.println("Operação inválida. Verifique se digitou uma opção válida.");
				break;
			}
			
			} while (opcao != 0);

			scanner.close(); // Fecha o scanner.
		}
		
		public static void menuSessao(){
			
			Scanner scanner = new Scanner(System.in);
			
			int opcao;
			
			do {
			System.out.println("--------- | MENU SESSÃO | --------- ");
			System.out.println("");

			System.out.println("[1] - Listar posts \n[2] - Criar post \n[3] - Criar amizade \n[4] - Desfazer amizade \n[0] - Menu anterior.");
			System.out.println("O que deseja realizar?: ");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				// listarPostagens();
				break;
				
			case 2:
				// criarPostagem(); 
				break;
				
			case 3:
				// criarAmizade(amigo);
				break;
				
			case 4:
				// desfazerAmizade(exAmigo);
				break;
				
			case 0:
				
				deslogar(sessao);
				System.out.println("Voltando pro menu anterior...");
				break;
				
			default:
				System.out.println("Operação inválida. Verifique se digitou uma opção válida.");
				break;
			}
			
			} while (opcao != 0);

			scanner.close(); // Fecha o scanner.
		}
			
		}

	

