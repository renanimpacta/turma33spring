package org.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.generation.minhaLojaDeGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{ // <tipo da entidade(tabela), Tipo do ID (ChavePrimaria))>
	
	//Esse metodo é equivalente à: select * from tb_postagem where titulo 
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
