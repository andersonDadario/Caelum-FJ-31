package br.com.caelum.loja.cliente;

import java.rmi.Naming;

import br.com.caelum.loja.rmi.Carrinho;
import br.com.caelum.loja.rmi.Livro;

public class ClienteLojaCarrinho {

	public static void main(String[] args) throws Exception {
		Carrinho carrinho = (Carrinho) Naming
				.lookup("rmi://127.0.0.1:1099/loja/carrinho");
		
		Livro l1 = new Livro();
		l1.setNome("Pais e Filhos");
		l1.setPreco(100.0);
		
		Livro l2 = new Livro();
		l2.setNome("Noites brancas");
		l2.setPreco(200.0);
		
		carrinho.addLivro(l1);
		carrinho.addLivro(l2);
		
		System.out.println(carrinho.getTotal());
	}

}
