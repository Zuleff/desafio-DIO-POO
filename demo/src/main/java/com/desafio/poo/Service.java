package com.desafio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    public void adicionarCursoBootcamp() {
        List<Curso> cursos = new ArrayList<>();
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Quantos cursos você deseja adicionar no seu bootcamp");
        int quantidadeCursos = entradaDados.nextInt();

        for (int i = 0; i < quantidadeCursos; i++) {
            Curso curso = new Curso();
            System.out.println("\nDigite o Titulo do Curso");
            curso.setTitulo(entradaDados.next());
            System.out.println("Digite a Descrição do Curso ");
            curso.setDescricao(entradaDados.next());
            System.out.println("Digite a Carga Horária do Curso");
            curso.setCargaHoraria(entradaDados.nextInt());
            cursos.add(curso);
        }

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = adicionarCursosBootcamp(cursos, entradaDados, mentoria);

        adicionarDesenvolvedores(entradaDados, bootcamp);
    }

    private void adicionarDesenvolvedores(Scanner entradaDados, Bootcamp bootcamp) {
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        entradaDados.close();
    }

    private Bootcamp adicionarCursosBootcamp(List<Curso> cursos, Scanner entradaDados, Mentoria mentoria) {
        Bootcamp bootcamp = new Bootcamp();
        System.out.println("Digite o nome do Bootcamp");
        bootcamp.setNome(entradaDados.next());
        System.out.println("Digite a descrição do Bootcamp");
        bootcamp.setDescricao(entradaDados.next());

        bootcamp.getConteudos().addAll(cursos);
        bootcamp.getConteudos().add(mentoria);
        return bootcamp;
    }

}
