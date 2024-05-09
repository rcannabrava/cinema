package model;

public class Titulo implements Comparable<Titulo> {

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;

	public Titulo() {
		super();
	}

	public Titulo(String nome, int anoDeLancamento) {
		super();
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}

	public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes,
			int totalDeAvaliacoes, int duracaoEmMinutos) {
		super();
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
		this.incluidoNoPlano = incluidoNoPlano;
		this.somaDasAvaliacoes = somaDasAvaliacoes;
		this.totalDeAvaliacoes = totalDeAvaliacoes;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void avaliacao(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double media() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	@Override
	public String toString() {
		return "\nNome do filme: " + nome + "\nAno de lancamento: " + anoDeLancamento + "\nDuracao do filme: "
				+ duracaoEmMinutos + " minutos\n";
	}

	@Override
	public int compareTo(Titulo outroTitulo) {
		return this.getNome().compareTo(outroTitulo.getNome());
	}

}
