package org.generation.minhaFarmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // define que a classe é uma entidade
@Table(name = "tb_categoria") // Cria uma tabela com nome "tb_categoria" dentro do banco de dados
public class Categoria {

	// atributos
	@Id // determina chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // determina auto_increment
	private long id;

	@NotNull // não pode ser nulo
	@Size(min = 1, max = 200) // tamando minimo e máximo de caractres
	private String descricao;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	// encapsulamento
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
