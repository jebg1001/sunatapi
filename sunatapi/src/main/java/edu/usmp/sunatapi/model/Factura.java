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
    private String descrip;
    private String razonSoc;
    private Integer montoIGV;
    private ZonedDateTime date;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrip() {
        return this.descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getRazonSoc() {
        return this.razonSoc;
    }

    public void setRazonSoc(String razonSoc) {
        this.razonSoc = razonSoc;
    }

    public Integer getMontoIGV() {
        return this.montoIGV;
    }

    public void setMontoIGV(Integer montoIGV) {
        this.montoIGV = montoIGV;
    }

    public ZonedDateTime getDate() {
        return this.date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }
    
}
