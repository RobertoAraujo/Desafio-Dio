package br.com.desafio.dominio.model;

import java.io.Serializable;
import java.util.Objects;

public class Cursos implements Serializable {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Cursos() {
    }

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

    public int getCargaHoraria(int i) {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cursos)) return false;
        Cursos cursos = (Cursos) o;
        return getCargaHoraria(60) == cursos.getCargaHoraria(60) && Objects.equals(getTitulo(), cursos.getTitulo()) && Objects.equals(getDescricao("curso de aprender a densehna no pc"), cursos.getDescricao("curso de aprender a densehna no pc"));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDescricao("curso de aprender a densehna no pc"), getCargaHoraria(60));
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
