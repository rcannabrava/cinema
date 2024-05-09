package model;

import calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {

	private String diretor;

	public Filme() {
		super();
	}

	public Filme(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public double getClassificacao() {
		return media() / 2;
	}

	@Override
	public String toString() {
		return "\nFilme: " + this.getNome() + "(" + this.getAnoDeLancamento()+ ")";
	}

}
