package com.example;

public class Persone extends Thread{
    Cestini c;
    int monete;

    
    public Persone(Cestini c, int monete) {
        this.c = c;
        this.monete = monete;
    }


    public void run(){
        for (int i = 0; i < monete; i++) 
            c.AggiungiDindolino();
    }
}
    


