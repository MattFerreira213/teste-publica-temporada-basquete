package br.com.mateus;
import java.util.Scanner;

import br.com.mateus.model.Temporada;

public class TemporadaMain {

	public static void main(String[] args) {
		Temporada temporada = new Temporada();

        System.out.println("Registro da Temporada");

        temporada.inserirDadosDaPartida();

        temporada.setPontuacaoMax(temporada.getJogo().getPontuacao());
        temporada.setPontuacaoMin(temporada.getJogo().getPontuacao());

        String showDadosDoJogo = temporada.consultarDados();
        System.out.println(showDadosDoJogo + "\n");

        Scanner entrada = getScannerNovoJojo();

        int verificador = entrada.nextInt();

        while (verificador == 1) {

            temporada.getJogo().setPontuacao(temporada.inserirDadosDaPartida());

            if (temporada.getJogo().getPontuacao() > temporada.getPontuacaoMax()) {
                temporada.setPontuacaoMax(temporada.getJogo().getPontuacao());
                temporada.setRecordePontuacaoMax(temporada.getRecordePontuacaoMax() + 1);
            } else if (temporada.getJogo().getPontuacao() < temporada.getPontuacaoMin()) {
                temporada.setPontuacaoMin(temporada.getJogo().getPontuacao());
                temporada.setRecordePontuacaoMin(temporada.getRecordePontuacaoMin() + 1);
            }

            showDadosDoJogo = temporada.consultarDados();
            System.out.println(showDadosDoJogo + "\n");

            entrada = getScannerNovoJojo();
            verificador = entrada.nextInt();
        }

	}
	
	/**
	 * 
	 * O getScannerNovoJogo simplismente exibirá uma mensagem 
	 * perguntando se irá ser inserido os dados de um novo jogo
	 * ou não.
	 * 
	 * @author Mateus Ferreira
	 * 
	 */
	private static Scanner getScannerNovoJojo() {
        System.out.print("Deseja resistrar novo jogo? Se sim digite 1, não digite 0:");
        return new Scanner(System.in);
    }

}
