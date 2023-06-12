package com.teste.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.model.Pessoa;
import com.teste.api.repository.Pessoa2Repository;


@RestController
@RequestMapping("/pessoa")

public class PessoaController {
	
	@Autowired
	private Pessoa2Repository pessoa2Repository;
	
	@GetMapping
	public List<Pessoa> listar(){
		return pessoa2Repository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoa salvar (@RequestBody Pessoa pessoa) {
		return pessoa2Repository.save(pessoa);
	}
}


