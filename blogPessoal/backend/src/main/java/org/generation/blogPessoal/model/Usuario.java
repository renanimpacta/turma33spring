package org.generation.blogPessoal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome é obrigatório")
	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(min = 5, max = 100)
	private String nome;
	
	@ApiModelProperty(example = "email@email.com.br")
	@NotNull(message = "O atributo usuário é obrigatório")
	@NotBlank(message = "O atributo Usuário é Obrigatório!")
	@Email(message = "O atributo Usuário deve ser um email válido!")
	@Size(min = 5, max = 100)
	private String usuario;
	
	@NotNull(message = "O atributo nome é obrigatório")
	@NotBlank(message = "O atributo senha é Obrigatório!")
	@Size(min = 5, max = 100)
	private String senha;
	
	// Primeiro método Construtor - Com os atributos
	public Usuario(long id, String nome, String usuario, String senha) {
			this.id = id;
			this.nome = nome;
			this.usuario = usuario;
			this.senha = senha;
			}
			
	// Segundo método Construtor - Sem os atributos
	public Usuario() { }


	
	//encapsulamento
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	


}
