package Aula02.src;

public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic";
        c1.carga = 10;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        System.out.println("\n");
        Caneta c2 = new Caneta();
        c2.cor = "preta";
        c2.ponta = 0.7f;
        c2.modelo = "bools";
        c2.carga = 50;

        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}
