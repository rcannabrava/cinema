package controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import model.Filme;
import model.Serie;
import model.Titulo;

public class Listas {
	public static void main(String[] args) {

		Filme meuFilme = new Filme("\nStar Wars", 1998);
		meuFilme.avaliacao(7);

		var outroFilme = new Filme("\nAvatar 2", 2023);
		outroFilme.avaliacao(5);

		var filmeDoRodrigo = new Filme("\nHarry Potter", 2001);
		filmeDoRodrigo.avaliacao(10);

		Serie tlou = new Serie("\nThe last of us", 2023);
		tlou.avaliacao(7);

		List<Titulo> lista = new LinkedList<>();
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(filmeDoRodrigo);
		lista.add(tlou);
		for (Titulo item : lista) {
			System.out.println(item.getNome());
			if (item instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação: " + filme.getClassificacao() + " estrelas");
			}
		}
		List<String> buscaPorArtista = new LinkedList<>();
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Rodrigo");
		buscaPorArtista.add("Dexter");
		System.out.println("-----------------------------");
		System.out.println(buscaPorArtista);

		Collections.sort(buscaPorArtista);
		System.out.println("\nDepois da ordenação");
		System.out.println(buscaPorArtista);
		System.out.println("-----------------------------");
		System.out.println("Ordem alfabética");
		Collections.sort(lista);
		System.out.println(lista);
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println("-----------------------------");
		System.out.println("Ordenando por ano");
		System.out.println(lista);

	}
}
