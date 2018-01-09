package br.inf.atividades.trabalho01;

import java.time.LocalTime;

public class Futebol extends Esporte<FutebolPosicao> {

	public Futebol() {
		setNrJogadores(11);
		setTempos(2);
		setTempoPeriodo(LocalTime.of(0, 45));
		setPontuacao(1);
	}
}