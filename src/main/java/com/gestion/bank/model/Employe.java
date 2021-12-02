package com.gestion.bank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "EMPLOYE")
@Getter
@Setter

public class Employe {

    @Id
    private String idEmploye;
    @Column(name = "MATRICULE")
    private String matricule;
    @Column(name = "FIRST NAME")
    private String firstName;
    @Column(name = "LAST NAME")
    private String lastName;
    @OneToMany(mappedBy = "employe", fetch = FetchType.LAZY)
    private List<Compte> listCompte;
    @ManyToOne
    @JoinColumn(name = "employe")
    private Employe employe;


}
