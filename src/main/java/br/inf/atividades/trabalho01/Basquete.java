package br.inf.atividades.trabalho01;

import java.time.LocalTime;

public class Basquete extends Esporte<BasquetePosicao> {

	public Basquete() {
		setNrJogadores(5);
		setTempos(4);
		setTempoPeriodo(LocalTime.of(0, 10));
		setPontuacao(1, 2, 3);
	}
}