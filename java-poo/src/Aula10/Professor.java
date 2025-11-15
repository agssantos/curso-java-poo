package Aula10;

public class Professor extends Pessoa {
    // ATRIBUTOS
    private String especialidade;
    private float salario;

    // METODOS
    public void reberAumento(float aum){
        this.salario += aum;
    }

    // GETTERS AND SETTERS
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
