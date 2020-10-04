package br.com.mateus.test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import br.com.mateus.model.Jogo;

public class InserirDadosDaPartitaTeste {
	
	@Test
	public void incersaoDosDadosDeEntradaDeCadaPartidaTest() {
		Jogo jogo = new Jogo();
		
		jogo.setPartida(1);
		jogo.setPontuacao(24);
		
		assertThat(jogo.getPartida(), is(1));
		assertThat(jogo.getPontuacao(), is(24));
	}

}
