package Aula02.src;

import java.io.ObjectInputValidation;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Qual o modelo?" + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
        System.out.println("Error! Nao posso rabiscar, tente retirar a tampa.");
        }else{
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
