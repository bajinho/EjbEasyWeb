package com.devmedia.ejbeasyweb;

import com.devmedia.ejbeasyweb.beans.GrausBean;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("grausMB")
@SessionScoped
public class GrausMB implements Serializable {

    @EJB
    GrausBean grausBean;

    double c;
    double resultadoF;

    public void converterParaFahrenheit() {
        this.resultadoF = this.grausBean.converterParaFahrenheit(c);
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getResultadoF() {
        return resultadoF;
    }
    public void setResultadoF(double resultadoF) {
        this.resultadoF = resultadoF;
    }
}