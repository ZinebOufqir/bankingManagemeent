package com.gestion.bank.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPT", discriminatorType = DiscriminatorType.STRING, length = 2)
@Table(name = "COMPTE")
@Getter
@Setter
@Data
public class Compte {

    @Id
    private String numCompte;
    @Column(name ="INTITULE")
    private String intitule;
    @Column(name ="NATURE")
    private int nature;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "idEmploye")
    private Employe employe;
    @OneToMany(mappedBy = "compte", fetch = FetchType.LAZY)
    private List<Operation> operation;

}