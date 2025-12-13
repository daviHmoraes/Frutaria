package model;

public class Fruta extends Produto {

	private double peso;

	public Fruta() {
		super();
		this.peso = 0.0;
	}

	public Fruta(String nome, double preco, int quantidade, double peso) {
		super(nome, preco, quantidade);
		this.peso = peso;
	}
	
	@Override
	public String detalhesEspecificos() {
		return "Peso:       " + peso + " kg";
	}

	// Getter e Setter
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}