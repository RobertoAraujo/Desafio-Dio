package br.com.desafio.dominio.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo implements Serializable  {
    private static final long serialVersionUID = 1L;

    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PARADO + 20;
    }

    public LocalDate getData(LocalDate now) {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mentoria)) return false;
        if (!super.equals(o)) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(data, mentoria.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), data);
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                '}';
    }
}
