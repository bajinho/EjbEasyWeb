package com.devmedia.ejbeasyweb.beans;

import jakarta.ejb.Stateful;

import java.util.HashSet;
import java.util.Set;


@Stateful
public class VisitasBean {

    private Set<String> listaVisitantes = new HashSet<String>();

    public Set<String> getListaVisitantes() {
        return listaVisitantes;
    }

    public void entrouVisita(String visitante) {
        listaVisitantes.add(visitante);
    }
}