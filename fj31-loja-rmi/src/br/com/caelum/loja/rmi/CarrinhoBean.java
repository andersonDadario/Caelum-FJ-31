package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {
	private static final long serialVersionUID = 2L;
	private double total;
	private List<Livro> livros = new ArrayList<Livro>();
	
	public CarrinhoBean() throws RemoteException {
		super();
	}

	@Override
	public void addLivro(Livro livro) throws RemoteException {
		livros.add(livro);
		total += livro.getPreco();
		
		// apenas para ver alguma saída no "servidor"
		System.out.printf("Livro %s adicionado com sucesso!\n", livro.getNome());
	}

	@Override
	public List<Livro> getLivros() throws RemoteException {
		return this.livros;
	}

	@Override
	public double getTotal() throws RemoteException {
		return this.total;
	}
}
