package com.teste.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.Pessoa;
import com.teste.api.repository.Pessoa2Repository;

@Service
public class PessoaServices {
	@Autowired
	private Pessoa2Repository pessoa2Repository;
	
	public List<Pessoa> findAll () {
		List<Pessoa> result = pessoa2Repository.findAll();
		return result;
	}
	
	public  Pessoa saveAll (Pessoa pessoa) {
	  return pessoa2Repository.save(pessoa);
	}
}
