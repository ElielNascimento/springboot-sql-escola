package br.com.crud.backend.dto;

import br.com.crud.backend.entities.Pessoa;

public class PessoaDTO {

	private Long id;
	private String nome;
	private int idade;
	private String cpf;
	private String sexo;

	public PessoaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PessoaDTO(Long id, String nome, int idade, String cpf, String sexo) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public PessoaDTO(Pessoa entity) {
		id = entity.getId();
		nome = entity.getNome();
		idade = entity.getIdade();
		cpf = entity.getCpf();
		sexo = entity.getSexo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

}
