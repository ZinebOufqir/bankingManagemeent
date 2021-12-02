package com.gestion.bank.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEparne extends Compte {

    private Double Taux;
}
