package br.dio.bootcamps;

import br.dio.bootcamps.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // criando os objetos
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("um curso de java que te ensina java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("igual o curso de java, só que pior");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("desbloqueie seu mindset quantico em java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp gigantesco que vai te fazer questionar sua sanidade");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println(devCamila.getConteudosInscritos());
        System.out.println(devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println();
        System.out.println("-------");

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println(devRicardo.getConteudosInscritos());
        devRicardo.progredir();
        devRicardo.progredir();
        devRicardo.progredir();
        System.out.println("-");
        System.out.println(devRicardo.getConteudosInscritos());
        System.out.println(devRicardo.getConteudosConcluidos());
        System.out.println("XP:" + devRicardo.calcularTotalXp());
    }
}