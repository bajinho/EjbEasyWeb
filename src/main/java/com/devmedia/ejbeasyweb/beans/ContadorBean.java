package com.devmedia.ejbeasyweb.beans;

import jakarta.ejb.Local;
import jakarta.ejb.Singleton;

@Singleton
@Local
public class ContadorBean {

    int contador = 2;

    public int getContador() {
        return contador;
    }

    public void incrementar(){
        contador++;
    }
}