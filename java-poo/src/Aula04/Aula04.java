package Aula04;

public class Aula04 {
    static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarelo");
        c1.status();

        System.out.println("*-=-=-==-=-=-=-=-*");

        Caneta c2 = new Caneta("KKK", 1.5f, "Laranja");
        c2.status();
    }
}
