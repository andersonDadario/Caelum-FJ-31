package br.com.caelum.loja.teste.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.loja.serializacao.Livro;

public class TestaLeituraDeObjetos {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("livros_flavio.txt"));
		List<Livro> livros = (List<Livro>) ois.readObject();
		
		for(Livro l : livros){
			System.out.println(l.getNome());
			System.out.println(l.getPreco());
			System.out.println("----------------------------------------");
		}
	}
}
