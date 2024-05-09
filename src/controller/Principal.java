package controller;

import java.util.ArrayList;

import calculadora.Recomendacao;
import calculadora.calculadoraDeTempo;
import model.Episodio;
import model.Filme;
import model.Serie;

public class Principal {

	public static void main(String[] args) {

		Filme meuFilme = new Filme("Star Wars", 1998);
		meuFilme.setDuracaoEmMinutos(200);
		meuFilme.avaliacao(8);
		meuFilme.avaliacao(5);
		meuFilme.avaliacao(10);
		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Nota geral: " + meuFilme.media());

		Serie tlou = new Serie("The last of us", 2023);
		tlou.setTemporadas(3);
		tlou.setEpisodioPorTemporada(15);
		tlou.setMinutosPorEspisodio(180);

		System.out.println("Tempo para maratonar The last of us: " + tlou.getDuracaoEmMinutos() + " minutos");

		Filme outroFilme = new Filme("Avatar 2", 2023);
		outroFilme.setDuracaoEmMinutos(180);

		calculadoraDeTempo calculadora = new calculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(tlou);
		System.out.println(calculadora.getTempoTotal());

		Recomendacao filtro = new Recomendacao();
		filtro.filtra(meuFilme);

		Episodio episodio = new Episodio();
		episodio.setNumero(3);
		episodio.setSerie(tlou);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);

		var filmeDoRodrigo = new Filme("Harry Potter", 2001);
		filmeDoRodrigo.setDuracaoEmMinutos(140);
		filmeDoRodrigo.avaliacao(10);

		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(outroFilme);
		listaDeFilmes.add(filmeDoRodrigo);
		listaDeFilmes.add(meuFilme);

		System.out.println("Sua lista tem " + listaDeFilmes.size() + " filmes");
		System.out.println("Primeiro filme: " + listaDeFilmes.get(1).getNome());
		System.out.println("------------------------------" + listaDeFilmes.get(1).toString());

	}
}
