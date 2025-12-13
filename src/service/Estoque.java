package service;

import java.util.List;
import java.util.ArrayList;
import model.Fruta;
import model.Produto;
import model.Verdura;
import view.Atendente;
import view.Mensagem;

public class Estoque {
	private List<Produto> lista = new ArrayList<>();

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
		case 1 -> { // ADICIONAR

			int tipoAdicionar = atendente.lerTipoAdicionar();

			switch (tipoAdicionar) {

			case 1 -> { // ADICIONA FRUTA
				String nome = atendente.lerNome();
				double preco = atendente.lerPreco();
				int quantidade = atendente.lerQuantidade();
				double peso = atendente.lerPeso();

				Fruta fruta = new Fruta(nome, preco, quantidade, peso);
				lista.add(fruta);
			}

			case 2 -> { // ADICIONA VERDURA
				String nome = atendente.lerNome();
				double preco = atendente.lerPreco();
				int quantidade = atendente.lerQuantidade();
				String tipo = atendente.lerTipo();

				Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
				lista.add(verdura);
			}

			default -> {
				Mensagem.opcaoInvalida();
				atendente.menuPrincipal();
			}

			}

		}

		case 2 -> { // LISTAR
			
			int tipoListar = atendente.lerTipoListar();
			
			switch (tipoListar) {
				case 1 -> { // LISTA AS FRUTAS

				if (lista.isEmpty()) {
					Mensagem.listaVazia();
				}

				for (Produto produto : lista) {
					if (produto instanceof Fruta fruta) {
						Mensagem.vizualizarProduto(fruta);
					}
				}
			}

				case 2 -> { // LISTA AS VERDURAS

				if (lista.isEmpty()) {
					Mensagem.listaVazia();
				}

				for (Produto produto : lista) {
					if (produto instanceof Verdura verdura) {
						Mensagem.vizualizarProduto(verdura);
					}
				}
			}

				case 3 -> { // LISTA TODOS

				if (lista.isEmpty()) {
					Mensagem.listaVazia();
				}

				for (Produto produto : lista) {
					if (produto instanceof Fruta fruta) {
						Mensagem.vizualizarProduto(fruta);
					} else if (produto instanceof Verdura verdura) {
						Mensagem.vizualizarProduto(verdura);
					}

				}
			}

				default -> {
					Mensagem.opcaoInvalida();
					atendente.menuPrincipal();
				}
			}
	
			String nome = atendente.lerNome();
			double preco = atendente.lerPreco();
			int quantidade = atendente.lerQuantidade();
			String tipo = atendente.lerTipo();

			Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
			lista.add(verdura);
		}

		case 3 -> { // REMOVER

			int tipoRemover = atendente.lerTipoRemover();
			
			switch (tipoRemover) {
				case 1 -> { // REMOVE FRUTA

				if (lista.isEmpty()) {
					Mensagem.listaVazia();
				}

				String nome = atendente.lerNome();
				boolean removido = false;

				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i) instanceof Fruta fruta && lista.get(i).getNome().equalsIgnoreCase(nome)) {
						lista.remove(i);
						removido = true;
						Mensagem.removido(nome);
						break;
					}
				}

				if (!removido) {
					Mensagem.naoEncontrado(nome);
				}

			}

				case 2 -> { // REMOVE VERDURA

				if (lista.isEmpty()) {
					Mensagem.listaVazia();
				}

				String nome = atendente.lerNome();
				boolean removido = false;

				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i) instanceof Verdura verdura && lista.get(i).getNome().equalsIgnoreCase(nome)) {
						lista.remove(i);
						removido = true;
						Mensagem.removido(nome);
						break;
					}
				}

				if (!removido) {
					Mensagem.naoEncontrado(nome);
				}

			}

				default -> {
					Mensagem.opcaoInvalida();
					atendente.menuPrincipal();
				}
			
			}
		}

		case 4 -> { // LISTAR

			int tipoBuscar = atendente.lerTipoBuscar();
			
			switch (tipoBuscar) {
				case 1 -> { // BUSCA FRUTA

				if (lista.isEmpty()) {
					Mensagem.listaVazia();
				}

				String nome = atendente.lerNome();
				boolean encontrado = false;

				for (Produto produto : lista) {
					if (produto instanceof Fruta fruta && produto.getNome().equalsIgnoreCase(nome)) {
						Mensagem.vizualizarProduto(fruta);
						encontrado = true;
						break;
					}
				}

				if (!encontrado) {
					Mensagem.naoEncontrado(nome);
				}

			}

				case 2 -> { // BUSCA VERDURA

				if (lista.isEmpty()) {
					Mensagem.listaVazia();
				}

				String nome = atendente.lerNome();
				boolean encontrado = false;

				for (Produto produto : lista) {
					if (produto instanceof Verdura verdura && produto.getNome().equalsIgnoreCase(nome)) {
						Mensagem.vizualizarProduto(verdura);
						encontrado = true;
						break;
					}
				}

				if (!encontrado) {
					Mensagem.naoEncontrado(nome);
				}

			}

				default -> {
					Mensagem.opcaoInvalida();
					atendente.menuPrincipal();
				}
			}
			
		    }

		case 5 -> { // CONTAR
			
			int tipoContar = atendente.lerTipoContar();
			
			switch (tipoContar) {
				case 1 -> { // CONTA AS FRUTAS
				int contadorFrutas = 0;

				for (Produto produto : lista) {
					if (produto instanceof Fruta) {
						contadorFrutas++;
					}
				}

				Mensagem.totalFruta(contadorFrutas);
			}

				case 2 -> { // CONTA AS VERDURAS
				int contadorVerduras = 0;

				for (Produto produto : lista) {
					if (produto instanceof Verdura) {
						contadorVerduras++;
					}
				}

				Mensagem.totalVerdura(contadorVerduras);
			}
				case 3 -> { // CONTA OS PRODUTOS
				int contadorProdutos = 0;
				
				for (Produto produto : lista) {
					contadorProdutos++;
				}
				
				Mensagem.totalProduto(contadorProdutos);
			}

				default -> {
					Mensagem.opcaoInvalida();
					atendente.menuPrincipal();
				}
			}
		}

		case 0 -> {
			Mensagem.finalizarApp();
		}

		default -> {
			Mensagem.opcaoInvalida();
		}

		}
	}
}