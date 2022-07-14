package Aula02.src;

import java.io.ObjectInputValidation;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Qual o modelo?" + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
        System.out.println("Error! Nao posso rabiscar, tente retirar a tampa.");
        }else{
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
