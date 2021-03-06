package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinhoBeanRemovido {
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		Carrinho carrinho = (Carrinho) ic
				.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/" + 
				"CarrinhoBean!br.com.caelum.loja.session.Carrinho?stateful");
		
		Livro l1 = new Livro();
		l1.setNome("Fausto");
		l1.setPreco(45);
		
		carrinho.addLivro(l1);
		
		carrinho.finalizaCompra();
		
		System.out.println("compra finalizada");
		
		//carrinho.addLivro(l1);
	}
}
