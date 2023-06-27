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

import com.teste.api.dto.PessoaDto;
import com.teste.api.model.Pessoa;
import com.teste.api.services.PessoaServices;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/pessoa")

public class PessoaController {
	
	@Autowired
	private PessoaServices pessoaServices;
	
	@GetMapping
	public List<PessoaDto> findAll(){
		List<Pessoa> result = pessoaServices.findAll();
		List<PessoaDto> dto = result.stream().map(x -> new PessoaDto(x)).toList();
		return dto;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoa salvar (@Valid @RequestBody Pessoa pessoa) {
		return pessoaServices.saveAll(pessoa);
	}
}


