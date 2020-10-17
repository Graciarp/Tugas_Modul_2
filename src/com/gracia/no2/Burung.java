package com.gracia.no2;

//class burung diwariskan dari class InheritanceBinatang
public class Burung extends InheritanceBinatang{
    public String getNama(){
        return nama;
    }

    public void terbang(){
        System.out.println(getNama()+" bergerak dengan cara terbang");
    }
}
