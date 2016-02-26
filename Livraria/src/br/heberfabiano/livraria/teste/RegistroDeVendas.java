package br.heberfabiano.livraria.teste;

import java.io.FileNotFoundException;

import br.heberfabiano.livraria.Autor;
import br.heberfabiano.livraria.CarrinhoDeCompras;
import br.heberfabiano.livraria.produtos.Ebook;
import br.heberfabiano.livraria.produtos.LivroFisico;
import br.heberfabiano.livraria.produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");

		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		System.out.println("Total: " + carrinho.getTotal());

		Produto[] produtos = carrinho.getProdutos();

//		for (Produto produto : produtos) {
//			if (produto != null) {
//				System.out.println(produto.getValor());
//			}
//		}

		for (int i = 0; i <= produtos.length; i++) {

			try {

				if (produtos[i] != null) {
					System.out.println(produtos[i].getValor());
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("deu exception no indice: " + i);
			}

		}

		System.out.println("fui executado");
		
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}