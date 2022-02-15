package br.com.desafio.dominio;

import br.com.desafio.dominio.model.Cursos;
import br.com.desafio.dominio.model.Mentoria;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {

        Cursos cursos01 = new Cursos();
        cursos01.setTitulo("Designner");
        cursos01.getDescricao("curso de aprender a densehna no pc");
        cursos01.getCargaHoraria(60);

        Cursos cursos02 = new Cursos();
        cursos02.setTitulo("Arquiteto de facas");
        cursos02.getDescricao("curso de aprender a densehna no facas no pc");
        cursos02.getCargaHoraria(20);

        Mentoria mentoria= new Mentoria();
        mentoria.getTitula("Alguem que veio dar aula");
        mentoria.getDescricao("Arquiteto de facas");
        mentoria.getData(LocalDate.now());


        System.out.println(cursos01);
    }
}
