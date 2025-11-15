package Aula10;

public class Aluno extends Pessoa{
    // ATRIBUTOS
    private int matricula;
    private String curso;

    // METODO
    public void cancelarMatricula(){
        System.out.println("A sua matricula será cancelada!");
    }

    // GETTERS AND SETTERS
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
