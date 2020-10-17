package com.gracia.no2;

public class Kucing extends InheritanceBinatang {
    public String getNama(){
        return nama;
    }

    public void meong(){
        System.out.println(getNama()+ " bunyinya meonggg");
    }
}
