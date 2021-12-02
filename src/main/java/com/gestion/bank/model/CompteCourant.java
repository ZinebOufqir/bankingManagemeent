package com.gestion.bank.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte{

    private Double decouvert;
}
