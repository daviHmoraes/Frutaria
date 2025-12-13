package view;

import java.util.Scanner;

public class Atendente {
	Scanner input = new Scanner(System.in);

	public int menuPrincipal() {
		System.out.println();
		System.out.println("=========================================");
		System.out.println("           SISTEMA HORTIFRUTI            ");
		System.out.println("=========================================");
		System.out.println();
		System.out.println("  1)  Cadastrar Produto");
		System.out.println("  2)  Listar Produtos");
		System.out.println("  3)  Remover Produto");
		System.out.println("  4)  Buscar Produto");
		System.out.println("  5)  Total de Produtos");
		System.out.println();
		System.out.println("  0)  Sair");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		int opcao = input.nextInt();
		input.nextLine(); // Limpa o Buffer
		return opcao;
	}
	
	public int lerTipoAdicionar() {
	    System.out.println();
	    System.out.println("Adicionar:");
	    System.out.println("1) Fruta");
	    System.out.println("2) Verdura");
	    System.out.print("Escolha uma opção: ");
	    int opcao = input.nextInt();
	    input.nextLine(); // Limpa o Buffer
	    return opcao;
	}
	
	public int lerTipoRemover() {
	    System.out.println();
	    System.out.println("Remover:");
	    System.out.println("1) Fruta");
	    System.out.println("2) Verdura");
	    System.out.println("3) Todos");
	    System.out.print("Escolha uma opção: ");
	    int opcao = input.nextInt();
	    input.nextLine(); // Limpa o Buffer
	    return opcao;
	}
	
	public int lerTipoBuscar() {
	    System.out.println();
	    System.out.println("Buscar:");
	    System.out.println("1) Fruta");
	    System.out.println("2) Verdura");
	    System.out.print("Escolha uma opção: ");
	    int opcao = input.nextInt();
	    input.nextLine(); // Limpa o Buffer
	    return opcao;
	}
	
	public int lerTipoListar() {
	    System.out.println();
	    System.out.println("Listar:");
	    System.out.println("1) Frutas");
	    System.out.println("2) Verduras");
	    System.out.println("3) Todos");
	    System.out.print("Escolha uma opção: ");
	    int opcao = input.nextInt();
	    input.nextLine(); // Limpa o Buffer
	    return opcao;
	}
	
	public int lerTipoContar() {
	    System.out.println();
	    System.out.println("Contar:");
	    System.out.println("1) Frutas");
	    System.out.println("2) Verduras");
	    System.out.println("3) Todos");
	    System.out.print("Escolha uma opção: ");
	    int opcao = input.nextInt();
	    input.nextLine(); // Limpa o Buffer
	    return opcao;
	}
	
	public double lerPeso() {
		System.out.println();
		System.out.print("Peso (kg): ");
		double peso = input.nextDouble();
		input.nextLine(); // Limpa o Buffer
		return peso;
	}

	public String lerNome() {
		System.out.println();
		System.out.print("Nome: ");
		return input.nextLine();
	}

	public double lerPreco() {
		System.out.println();
		System.out.print("Preço (use vírgula): ");
		double preco = input.nextDouble();
		input.nextLine(); // Limpar o buffer
		return preco;
	}

	public int lerQuantidade() {
		System.out.println();
		System.out.print("Quantidade: ");
		int quantidade = input.nextInt();
		input.nextLine(); // Limpa o Buffer
		return quantidade;
	}

	public String lerTipo() {
		System.out.println();
		System.out.print("Tipo: ");
		return input.nextLine();
	}
	
	public String lerRemover() {
		System.out.println();
		System.out.print("Nome a remover: ");
		return input.nextLine();
	}
	
	public String lerBuscar() {
		System.out.println();
		System.out.print("Digite o nome a buscar: ");
		return input.nextLine();
	}

	
}
