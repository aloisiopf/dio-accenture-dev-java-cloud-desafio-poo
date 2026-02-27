import java.time.LocalDate;

import br.eti.aloisio.dio.accenture.dominio.Bootcamp;
import br.eti.aloisio.dio.accenture.dominio.Curso;
import br.eti.aloisio.dio.accenture.dominio.Dev;
import br.eti.aloisio.dio.accenture.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Dominando POO Java");
        curso1.setCargoHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("Controlando o frontend com Javascript");
        curso2.setCargoHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria do curso de Java");
        mentoria.setDescricao("O curso de Java possui uma equipe especializada de mentoria para tirar dúvidas");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer - Intermediário");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Maria");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+ dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+ dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }
}
