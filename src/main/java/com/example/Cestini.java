package com.example;
public class Cestini extends Thread{
    int contatore;

    
    public Cestini(int contatore) {
        this.contatore = contatore;
    }

    public int getContatore(){

        return contatore;

    }
    public void AggiungiDindolino(){

        contatore++;

    }


    
}
