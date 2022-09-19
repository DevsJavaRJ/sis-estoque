package br.com.sisestoque.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sisestoque.dtos.RequestFuncionarioDto;

@RestController
public class CartorioController {
	
	public ResponseEntity<String> cadastrar (@Validated @RequestBody RequestFuncionarioDto dto){
		
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

}
