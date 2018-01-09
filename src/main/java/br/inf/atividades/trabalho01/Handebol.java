package br.inf.atividades.trabalho01;

import java.time.LocalTime;

public class Handebol extends Esporte<HandebolPosicao> {

	public Handebol() {
		setNrJogadores(7);
		setTempos(2);
		setTempoPeriodo(LocalTime.of(0, 30));
		setPontuacao(1);
	}
}