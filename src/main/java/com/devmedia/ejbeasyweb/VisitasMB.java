package com.devmedia.ejbeasyweb;

import com.devmedia.ejbeasyweb.beans.VisitasBean;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("visitasMB")
@SessionScoped
public class VisitasMB implements Serializable {

    @EJB
    VisitasBean visitasBean;

    private String visitante;

    public void entrouVisita() {
        visitasBean.entrouVisita(visitante);
    }

    public List<String> getVisitas() {
        return new ArrayList<String>(visitasBean.getListaVisitantes());
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }
}