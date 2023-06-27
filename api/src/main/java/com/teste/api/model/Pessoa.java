package com.teste.api.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pessoa {
    @EqualsAndHashCode.Include
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long Id;

	@NotBlank(message="O campo Nome não pode estar vazio !")
    private String nome;
	
	private LocalDate dataNascimento;
	@NotBlank(message="O campo Sexo não pode estar vazio !")
	private String sexo;
	@NotBlank(message="O campo grauParentesco não pode estar vazio !")
	private String grauParentesco;

	public Pessoa(String nome, LocalDate dataNascimento, String sexo, String grauParentesco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.grauParentesco = grauParentesco;
	}

	public Pessoa() {
	}

	
}
