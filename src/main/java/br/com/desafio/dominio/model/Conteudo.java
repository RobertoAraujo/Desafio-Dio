package br.com.desafio.dominio.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Conteudo implements Serializable {
    private static final long serialVersionUID = 1L;
    protected  static  final double XP_PARADO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao(String s) {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conteudo)) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(getTitulo(), conteudo.getTitulo()) && Objects.equals(getDescricao("Arquiteto de facas"), conteudo.getDescricao("Arquiteto de facas"));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDescricao("Arquiteto de facas"));
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

}
