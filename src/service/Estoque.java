package service;

import java.util.List;
import java.util.ArrayList;
import model.Fruta;
import model.Verdura;
import view.Atendente;
import view.Mensagem;

public class Estoque {
	private List<Fruta> listaFruta = new ArrayList<>();
	private List<Verdura> listaVerdura = new ArrayList<>();

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
		case 1 -> {
			String nome = atendente.lerNome();
			double preco = atendente.lerPreco();
			int quantidade = atendente.lerQuantidade();
			double peso = atendente.lerPeso();

			Fruta fruta = new Fruta(nome, preco, quantidade, peso);
			listaFruta.add(fruta);
		}

		case 2 -> {
			String nome = atendente.lerNome();
			double preco = atendente.lerPreco();
			int quantidade = atendente.lerQuantidade();
			String tipo = atendente.lerTipo();

			Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
			listaVerdura.add(verdura);
		}

		case 3 -> {
			for (Fruta fruta : listaFruta) {
				Mensagem.vizualizarFruta(fruta);
			}
		}

		case 4 -> {
			for (Verdura verdura : listaVerdura) {
				Mensagem.vizualizarVerdura(verdura);
			}
		}

		case 5 -> {
			String nome = atendente.lerRemover();
			boolean removido = false;

			for (int indice = 0; indice < listaFruta.size(); indice++) {
				if (listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
					listaFruta.remove(indice);
					removido = true;
					break;
				}
			}

			if (removido) {
				Mensagem.removido(nome);
			} else {
				Mensagem.naoEncontrado(nome);
			}
		}
		
		case 6 -> {
			String nome = atendente.lerNome();
			boolean removido = false;
			
			for(int i = 0; i < listaVerdura.size(); i++) {
				if (listaVerdura.get(i).getNome().equalsIgnoreCase(nome)) {
					listaVerdura.remove(i);
					removido = true;
					break;
				}
				
				if (removido) {
					Mensagem.removido(nome);
				} else {
					Mensagem.naoEncontrado(nome);
				}
			}
		}
		
		case 0 -> {
			Mensagem.finalizarApp();
		}
		
		}
	}
}