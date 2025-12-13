package model;

public abstract class Produto {
	
	protected String nome;
	protected double preco;
	protected int quantidade;
	protected final int codigo;
	protected static int contadorProduto = 1;
	
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
		this.codigo = contadorProduto++;
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.codigo = contadorProduto++;
	}
	
	public abstract String detalhesEspecificos();
	
	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
