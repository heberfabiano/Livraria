package br.heberfabiano.livraria;
import br.heberfabiano.livraria.produtos.Produto;

public class CarrinhoDeCompras {

	private Produto[] produtos = new Produto[10];
	private double total;
	private int contador = 0;

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		produtos[contador] = produto;
		contador++;
		total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}

}