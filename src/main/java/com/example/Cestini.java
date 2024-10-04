package com.example;
public class Cestini extends Thread{
    int contatore;

    
    public Cestini(int contatore) {
        this.contatore = contatore;
    }

    public int getContatore(){

        return contatore;

    }
    synchronized public void AggiungiDindolino(){
        int appo= contatore + 1;
        contatore= appo;

    }


    
}
