package com.adilmx.jaxb_jaxws_app.model;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
    @XmlAttribute
    private Long id;
    @XmlElement
    private double solde ;
    @XmlTransient
    private Date dateCreation;

    public Account() {
    }

    public Account(Long id, double solde, Date dateCreation) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
