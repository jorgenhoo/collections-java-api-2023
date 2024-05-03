package main.java.list.OperacoesBasicas;

public class Item {
  //atributos
	private String nome;
	private double preco;
	private int qtd;

	public Item(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQtd() {
		return qtd;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\n" +
				"Preço: " + this.getPreco() + "\n" +
				"Quantidade: " + this.getQtd() + "\n\n";
	}
}
