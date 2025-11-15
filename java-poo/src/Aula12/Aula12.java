package Aula12;

public class Aula12 {
    static void main(String[] args) {
       // Animal n = new Animal;  -> Não da porque a classe é ABSTRATA
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

    }
}
