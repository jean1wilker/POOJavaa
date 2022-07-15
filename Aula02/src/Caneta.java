package Aula02.src;

import java.io.ObjectInputValidation;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){//Esse carinha aqui vai ser o método construtor
        this.modelo = m;
        this.ponta = p;
        this.tampar();
        this.cor = c;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
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

    public void status(){
        System.out.println("Qual o modelo?" + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
}
