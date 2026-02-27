import java.time.LocalDate;

import br.eti.aloisio.dio.accenture.dominio.Curso;
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

    }
}
