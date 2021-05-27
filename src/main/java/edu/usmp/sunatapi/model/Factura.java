package edu.usmp.sunatapi.model;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "t_factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rucEmisor;
    private String rucContribuyente;
    private Integer montoFactura;
    private ZonedDateTime date;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRucEmisor() {
        return this.rucEmisor;
    }

    public void setRucEmisor(String rucEmisor) {
        this.rucEmisor = rucEmisor;
    }

    public String getRucContribuyente() {
        return this.rucContribuyente;
    }

    public void setRucContribuyente(String rucContribuyente) {
        this.rucContribuyente = rucContribuyente;
    }

    public Integer getMontoFactura() {
        return this.montoFactura;
    }

    public void setMontoFactura(Integer montoFactura) {
        this.montoFactura = montoFactura;
    }

    public ZonedDateTime getDate() {
        return this.date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    
    
}
