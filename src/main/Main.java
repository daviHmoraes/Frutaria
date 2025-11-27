package main;

import service.Estoque;
import view.Atendente;

public class Main {
	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int opcaoMenuEscolhida;

		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);
		} while (opcaoMenuEscolhida != 0);

	}
}
