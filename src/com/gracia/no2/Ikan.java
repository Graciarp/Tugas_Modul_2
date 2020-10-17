package com.gracia.no2;

public class Ikan extends InheritanceBinatang{
    public String getNama(){
        return nama;
    }

    public void berenang(){
        System.out.println(getNama()+" Bergerak dengan cara berenang");
    }
}
