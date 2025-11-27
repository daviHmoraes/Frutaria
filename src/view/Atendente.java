package view;

import java.util.Scanner;
import model.Fruta;

public class Atendente {
	Scanner input = new Scanner(System.in);

	public int menuPrincipal() {
		System.out.println("1 - Cadastrar fruta");
		System.out.println("2 - Cadastrar verdura");
		System.out.println("3 - Listar frutas");
		System.out.println("4 - Listar verdura");
		System.out.println("5 - Remover fruta");
		System.out.println("6 - Remover verdura");
		System.out.println("0 - Sair");
		System.out.print("Escolha uma opção: ");
		int opcao = input.nextInt();
		input.nextLine(); // Limpa o Buffer
		return opcao;
	}
	
	public double lerPeso() {
		System.out.print("Digite o peso: ");
		double peso = input.nextDouble();
		input.nextLine(); // Limpa o Buffer
		return peso;
	}

	public String lerNome() {
		System.out.print("Digite o nome: ");
		return input.nextLine();
	}

	public double lerPreco() {
		System.out.print("Digite o preço: ");
		double preco = input.nextDouble();
		input.nextLine(); // Limpar o buffer
		return preco;
	}

	public int lerQuantidade() {
		System.out.print("Digite a quantidade: ");
		int quantidade = input.nextInt();
		input.nextLine(); // Limpa o Buffer
		return quantidade;
	}

	public String lerTipo() {
		System.out.print("Digite o tipo: ");
		return input.nextLine();
	}
	
	public String lerRemover() {
		System.out.println("Digite o nome a ser removido:");
		return input.nextLine();
	}
	
}
