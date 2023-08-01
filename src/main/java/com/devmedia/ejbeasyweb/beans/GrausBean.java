package com.devmedia.ejbeasyweb.beans;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;

@Stateless
@Local
public class GrausBean {

    public double converterParaFahrenheit(double c) {
        return c * 1.8 + 32;
    }
}