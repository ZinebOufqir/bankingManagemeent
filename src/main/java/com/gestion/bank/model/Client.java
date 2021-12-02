package com.gestion.bank.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENT")
@Getter
@Setter
@Data
public class Client {

    @Id
    private String idClient;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name ="LASTNAME")
    private String lastName;
    @Column(name ="ADRESSE")
    private String address;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Compte> listComptes;


}