package br.com.carteiradevacinacao.modelo;

import main.java.br.com.carteiradevacinacao.modelo.Usuario;

public class Vacina {

    private String nomeVacina;
    private String dataInicio;
    private String dataFim;
    private Usuario usuario;

    public String getNomeVacina() {
	return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
	this.nomeVacina = nomeVacina;
    }

    public String getDataInicio() {
	return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
	this.dataInicio = dataInicio;
    }

    public String getDataFim() {
	return dataFim;
    }

    public void setDataFim(String dataFim) {
	this.dataFim = dataFim;
    }

    public Usuario getUsuario() {
	return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
    }

    @Override public String toString() {
	return "Vacina{"
			+ "nomeVacina='"
			+ nomeVacina
			+ '\''
			+ ", dataInicio='"
			+ dataInicio
			+ '\''
			+ ", dataFim='"
			+ dataFim
			+ '\''
			+ ", usuario="
			+ usuario
			+ '}';
    }
}
