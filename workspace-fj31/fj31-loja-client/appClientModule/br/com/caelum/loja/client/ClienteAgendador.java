package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.session.Agendador;

public class ClienteAgendador {
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		Agendador agendador = (Agendador) ic
				.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/" + 
				"AgendadorBean!br.com.caelum.loja.session.Agendador");
		
		// a cada 2 min e 10 seg
		agendador.agenda("*/2", "10");
	}
}
