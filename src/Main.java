import java.time.LocalDate;
import Desafio.Dominio.Bootcamp;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Dev;
import Desafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Guilherme" + devGuilherme.getConteudosInscritos());
        System.out.println("--");
        devGuilherme.progredir();
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("Conteudos Concluidos Guilherme" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP: " + devGuilherme.calcularTotalXp());
        System.out.println("----------------------");


        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jose" + devJose.getConteudosInscritos());
        System.out.println("--");
        devJose.progredir();
        devJose.progredir();
        System.out.println("Conteudos Concluidos Jose" + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());
        System.out.println("----------------------");
    }
}
