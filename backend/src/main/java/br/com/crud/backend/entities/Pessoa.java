package br.com.crud.backend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.crud.backend.enus.PessoaEnum;

@Entity
@Table(name = "tbl_pessoa")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome = "eliel";
	private int idade = 18; // TEM QUE SER MAIOR QUE 18
	private String cpf = "084505";
	private String sexo = "m";
	private PessoaEnum pessoaEnum;

	public Pessoa() {
	}

	public Pessoa(Long id, String nome, int idade, String cpf, String sexo, PessoaEnum pessoaEnum) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;

		this.cpf = cpf;
		this.sexo = sexo;
		this.pessoaEnum = pessoaEnum;

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

	public PessoaEnum getPessoaEnum() {
		return pessoaEnum;
	}

	public void setPessoaEnum(PessoaEnum pessoaEnum) {
		this.pessoaEnum = pessoaEnum;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}

}
