package br.heberfabiano.livraria.teste;
import br.heberfabiano.livraria.Autor;
import br.heberfabiano.livraria.produtos.Ebook;
import br.heberfabiano.livraria.produtos.Livro;
import br.heberfabiano.livraria.produtos.LivroFisico;

//Pagina 161

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-10");

		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");

		System.out.println(livro);

		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caelum.com.br");
		outroAutor.setCpf("123.456.789-10");

		Livro ebook = new Ebook(outroAutor);
		ebook.setNome("Lógica de Programação");
		ebook.setDescricao("Crie seus primeiros programas");
		ebook.setValor(59.90);
		ebook.setIsbn("978-85-66250-22-0");

		System.out.println(ebook);
		
	}

}
