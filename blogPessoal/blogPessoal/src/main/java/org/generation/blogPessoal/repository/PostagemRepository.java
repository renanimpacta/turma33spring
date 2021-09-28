package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {  // <tipo da entidade(tabela), Tipo do ID (ChavePrimaria))>
	/*
	 * Esse metodo é equivalente à: select * from tb_postagem where titulo 
	 */
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
}
