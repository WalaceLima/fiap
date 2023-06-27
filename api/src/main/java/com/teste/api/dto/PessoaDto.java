package com.teste.api.dto;

import java.time.LocalDate;

import com.teste.api.model.Pessoa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class PessoaDto {
   @EqualsAndHashCode.Include
	private Long Id;
	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	private String grauParentesco;
	
	public PessoaDto(Pessoa pessoa) {
		this.Id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.dataNascimento = pessoa.getDataNascimento();
		this.sexo = pessoa.getSexo();
		this.grauParentesco = pessoa.getGrauParentesco();
	}	
	public PessoaDto() {

	}

}