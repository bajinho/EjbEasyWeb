package com.devmedia.ejbeasyweb;

import com.devmedia.ejbeasyweb.beans.ContadorBean;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("contadorMB")
@SessionScoped
public class ContadorMB implements Serializable {

    @EJB
    ContadorBean contadorBean;

    public void incrementar() {
        contadorBean.incrementar();
    }

    public int getContador() {
        return contadorBean.getContador();
    }
}

