package br.com.mateus.test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.mateus.model.Jogo;
import br.com.mateus.model.Temporada;

public class ConsultarDadosDaTemporadaTeste {
	
	Jogo jogo;
	Temporada temporada;
	
	@Before
	public void setUp() {
		jogo = new Jogo();
		temporada = new Temporada();
	}
	
	@Test
	public void consultaDeDadosDaTemporadaTest() {
	
	String strDadosTemporada = temporada.consultarDados();
	
	String dadosDaTemporsda = "Partida: " + jogo.getPartida() + " | Pontua��o: " + jogo.getPontuacao() + " | M�nimo da temporada: " + temporada.getPontuacaoMin() + " | " +
            "M�ximo da temporada: " + temporada.getPontuacaoMax() + " | Quebra recorde min: " + temporada.getRecordePontuacaoMin() + " | " +
            "Quebra recorde max: " + temporada.getRecordePontuacaoMax();
	
	assertEquals(strDadosTemporada, dadosDaTemporsda);
		
	}

}
