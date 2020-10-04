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
	
	String dadosDaTemporsda = "Partida: " + jogo.getPartida() + " | Pontuação: " + jogo.getPontuacao() + " | Mínimo da temporada: " + temporada.getPontuacaoMin() + " | " +
            "Máximo da temporada: " + temporada.getPontuacaoMax() + " | Quebra recorde min: " + temporada.getRecordePontuacaoMin() + " | " +
            "Quebra recorde max: " + temporada.getRecordePontuacaoMax();
	
	assertEquals(strDadosTemporada, dadosDaTemporsda);
		
	}

}
