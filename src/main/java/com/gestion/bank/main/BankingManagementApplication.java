package com.gestion.bank.main;

import dto.CompteRequestDTO;
import dto.CompteResponseDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/banking/api")
public class BankingManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankingManagementApplication.class, args);

	}
	@PostMapping("/consulter")
	public ResponseEntity<CompteResponseDTO> consulter(@RequestBody() CompteRequestDTO compteRequestDTO){
		CompteResponseDTO compteResponseDTO = new CompteResponseDTO();
		if (compteRequestDTO.getRib() == null || compteRequestDTO.getRib().length() != 24){
			compteResponseDTO.setMessageErr("Votre RIB n'est pas conforme.");
		}
		compteResponseDTO.setNumCompte(compteRequestDTO.getRib().substring(10, 21));
		return new ResponseEntity<>(compteResponseDTO, HttpStatus.OK);
		//012 345 6789 01234567890 1 23
	}

}
