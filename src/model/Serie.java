package model;

public class Serie extends Titulo {

	private int temporadas;
	private int episodioPorTemporada;
	private boolean ativa;
	private int minutosPorEspisodio;
	
	public Serie(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getEpisodioPorTemporada() {
		return episodioPorTemporada;
	}

	public void setEpisodioPorTemporada(int episodioPorTemporada) {
		this.episodioPorTemporada = episodioPorTemporada;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getMinutosPorEspisodio() {
		return minutosPorEspisodio;
	}

	public void setMinutosPorEspisodio(int minutosPorTemporada) {
		this.minutosPorEspisodio = minutosPorTemporada;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodioPorTemporada * minutosPorEspisodio;
	}

	@Override
	public String toString() {
		return "\nSérie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
	}
}
