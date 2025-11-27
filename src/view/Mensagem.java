package view;

import model.Fruta;
import model.Verdura;

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

	public static void vizualizarFruta(Fruta fruta) {
		System.out.println("--------");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: R$" + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Peso: " + fruta.getPeso());
		System.out.println("Código: " + fruta.getCodigo());
	}
	
	public static void vizualizarVerdura(Verdura verdura) {
		System.out.println("--------");
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preço: R$" + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
		System.out.println("Código: " + verdura.getCodigo());
	}
	
}
