package org.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.generation.minhaLojaDeGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{ // <tipo da entidade(tabela), Tipo do ID (ChavePrimaria))>
	
	//Esse metodo é equivalente à: select * from tb_postagem where titulo 
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
	
}
