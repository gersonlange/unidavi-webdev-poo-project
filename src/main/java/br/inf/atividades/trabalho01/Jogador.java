package br.inf.atividades.trabalho01;

public class Jogador<E> {
	private String nome;
	private E posicao;

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPosicao(E posicao) {
		this.posicao = posicao;
	}
	
	public E getPosicao() {
		return posicao;
	}
}