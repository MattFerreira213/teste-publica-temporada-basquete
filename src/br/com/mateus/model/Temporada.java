package br.com.mateus.model;

import lombok.Data;

import java.util.Scanner;

import br.com.mateus.implementation.IConsultarDados;
import br.com.mateus.implementation.IInserirDados;

@Data
public class Temporada implements IInserirDados, IConsultarDados {

    private Jogo jogo = new Jogo();
    private int pontuacaoMax;
    private int pontuacaoMin;

    private int recordePontuacaoMax;
    private int recordePontuacaoMin;

    @Override
    public int inserirDadosDaPartida() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Partida: ");

        jogo.setPartida(entrada.nextInt());
        System.out.print("Pontua��o: ");
        jogo.setPontuacao(entrada.nextInt());
        return jogo.getPontuacao();
    }

    @Override
    public String consultarDados() {
        String dadosDaTemporsda = "Partida: " + jogo.getPartida() + " | Pontua��o: " + jogo.getPontuacao() + " | M�nimo da temporada: " + pontuacaoMin + " | " +
                "M�ximo da temporada: " + pontuacaoMax + " | Quebra recorde min: " + recordePontuacaoMin + " | " +
                "Quebra recorde max: " + recordePontuacaoMax;
        
        return dadosDaTemporsda;
    }
}
