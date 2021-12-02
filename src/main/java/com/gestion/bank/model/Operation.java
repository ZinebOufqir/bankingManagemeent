package com.gestion.bank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OP", discriminatorType = DiscriminatorType.STRING, length = 1)
@Table(name = "OPERATION")
@Getter
@Setter

public class Operation {

    @Id
    private String refOperation;
    @Column(name = "DATE")
    private Date dateOperation;
    @Column(name = "INTITULE")
    private String intitule;
    @ManyToOne
    @JoinColumn(name = "idEmploye")
    private Employe employe;
    @ManyToOne
    @JoinColumn(name = "numCompte")
    private Compte compte;

}
