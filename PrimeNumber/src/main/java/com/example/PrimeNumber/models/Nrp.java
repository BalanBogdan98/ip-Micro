package com.example.PrimeNumber.models;

public class Nrp {

    private int number;

    public Nrp(int number){
        this.number=number;
    }

    public String getprime(){
        if(number<0)
            return "no";

        for(int i=2;i<=number/2;i++)
            if(number%i==0)
            {return "no";}

        return "yes";
    }
}
