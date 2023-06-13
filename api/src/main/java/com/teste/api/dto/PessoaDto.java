package com.teste.api.dto;

import com.teste.api.model.Pessoa;

public class PessoaDto {
	private Long Id;
	private String nome;
	private String dataNascimento;
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
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public Long getId() {
		return Id;
	}

}