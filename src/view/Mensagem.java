package view;

import model.Produto;
import model.Verdura;
import model.Fruta;

public class Mensagem {

	public static void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}
	
	public static void naoEncontrado(String nome) {
		System.out.println(nome + " não encontrado(a).");
	}
	
	public static void removido(String nome) {
		System.out.println("'" + nome + "' foi removido(a).");
	}

	public static void vizualizarProduto(Produto produto) {
		System.out.println();
		System.out.println("=========================================");
		System.out.println("             DETALHES - Produto          ");
		System.out.println("=========================================");
		System.out.println("Nome:       " + produto.getNome());
		System.out.println("Preço:      R$ " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println(produto.detalhesEspecificos());
		System.out.println("Código:     " + produto.getCodigo());
		System.out.println("=========================================");
	}

	
	public static void opcaoInvalida() {
		System.out.println("Opção Inválida!");
	}
	
	public static void encontrado(String nome) {
		System.out.println(nome + " encontrado na lista!");
	}
	
	public static void totalFruta(int contador) {
		System.out.println("A lista possui " + contador + " frutas!");
	}
	
	public static void totalVerdura(int contador) {
		System.out.println("A lista possui " + contador + " verduras!");
	}

	public static void totalProduto(int contador) {
		System.out.println("A lista possui " + contador + " Produtos!");
	}
	
	public static void listaVazia() {
		System.out.println("A lista está vazia!");
	}
		
}
