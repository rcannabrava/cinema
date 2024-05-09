package calculadora;

import model.Titulo;

public class calculadoraDeTempo {

	private int tempoTotal;

	public int getTempoTotal() {
		return this.tempoTotal;
	}

	public void inclui(Titulo titulo) {
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
}
