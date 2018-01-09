package br.inf.atividades.trabalho01;

import java.time.LocalTime;
import java.util.Arrays;

public class Esporte<E>
{
	private int nrjogadores, tempos, pontos;
	private LocalTime tempoPeriodo;
	private int[] pontuacao;
	private E[] posicoes;

	protected void setNrJogadores(int jogadores) {
		this.nrjogadores = jogadores;
	}

	public int getNrJogadores() {
		return nrjogadores;
	}

	protected void setTempos(int tempos) {
		this.tempos = tempos;
	}
	
	public int getTempos() {
		return tempos;
	}

	protected void setTempoPeriodo(LocalTime tempoPeriodo) {
		this.tempoPeriodo = tempoPeriodo;
	}
	
	public LocalTime getTempoPeriodo() {
		return tempoPeriodo;
	}
	
	protected void setPontuacao(int... pontuacao) {
		this.pontuacao = pontuacao;
	}

	protected boolean addPonto(int i) {

		if ( Arrays.asList(pontuacao).contains(i) )
			return false;

		pontos += i;

		return true;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPosicoes(E... posicoes) {
		this.posicoes = posicoes;
	}

	public E[] getPosicoes() {
		return posicoes;
	}

}