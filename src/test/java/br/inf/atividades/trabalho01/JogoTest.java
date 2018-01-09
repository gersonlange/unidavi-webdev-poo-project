package br.inf.atividades.trabalho01;

import org.junit.Test;

public class JogoTest {
	@Test
	public void deveJogador() {
		Jogador<FutebolPosicao> joga = new Jogador<>();
		joga.setNome("Teste");
		joga.setPosicao(FutebolPosicao.ALA);
		System.out.println(joga.getNome());
		System.out.println(joga.getPosicao());
	}

	@Test
	public void deveJogarFutebolPontoErro() {
		Futebol fut = new Futebol();
		System.out.println(fut.addPonto(2));
	}

	@Test
	public void deveJogarFutebolPonto() {
		Futebol fut = new Futebol();
		fut.setPosicoes(FutebolPosicao.GOLEIRO, FutebolPosicao.ZAGUEIRO, FutebolPosicao.LATERAL,
				FutebolPosicao.MEIOCAMPO, FutebolPosicao.ALA, FutebolPosicao.LIBERO, 
				FutebolPosicao.ATACANTE );

		System.out.println(fut.addPonto(1));
		System.out.println(fut.getNrJogadores());
		System.out.println(fut.getPontos());
		System.out.println(fut.getTempos());
		System.out.println(fut.getTempoPeriodo());

		for (FutebolPosicao fj : fut.getPosicoes() )
			System.out.println(fj);
	}

	@Test
	public void deveJogarBasquetePontoErro() {
		Basquete bas = new Basquete();
		System.out.println(bas.addPonto(4));
	}

	@Test
	public void deveJogarBasquetePonto() {
		Basquete bas = new Basquete();
		bas.setPosicoes(BasquetePosicao.ARMADOR, BasquetePosicao.LANCADOR, BasquetePosicao.LIBERO,
			BasquetePosicao.PIVO, BasquetePosicao.LANCADOR);
		System.out.println(bas.addPonto(2));
		System.out.println(bas.getNrJogadores());
		System.out.println(bas.getPontos());
		System.out.println(bas.getTempos());
		System.out.println(bas.getTempoPeriodo());

		for (BasquetePosicao bj : bas.getPosicoes() )
			System.out.println(bj);
	}

	@Test
	public void deveJogarHandebolPontoErro() {
		Handebol hand = new Handebol();
		System.out.println(hand.addPonto(4));
	}

	@Test
	public void deveJogarHandebolPonto() {
		Handebol hand = new Handebol();
		hand.setPosicoes(HandebolPosicao.ARMADOR, HandebolPosicao.ATAQUE,
				HandebolPosicao.DEFESA, HandebolPosicao.GOLEIRO, HandebolPosicao.MEIA,
				HandebolPosicao.PIVO, HandebolPosicao.PONTA);
		System.out.println(hand.addPonto(2));
		System.out.println(hand.getNrJogadores());
		System.out.println(hand.getPontos());
		System.out.println(hand.getTempos());
		System.out.println(hand.getTempoPeriodo());

		for (HandebolPosicao bj : hand.getPosicoes() )
			System.out.println(bj);
	}
}