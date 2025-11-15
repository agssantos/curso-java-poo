package Aula11;

public class Aula11 {
    static void main(String[] args) {
        Visitante v1 = new Visitante();

        Aluno a1 = new Aluno();
        a1.setNome("Alan");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.setCurso("Programação");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jucelindo");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}
