package com.gestion.bank.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class BankingController {

    public String consulter(){

        return "Hello API";

    }
}
