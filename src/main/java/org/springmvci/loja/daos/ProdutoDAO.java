package org.springmvci.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springmvci.loja.models.Produto;

@Repository
@org.springframework.transaction.annotation.Transactional
public class ProdutoDAO {

	@PersistenceContext
	EntityManager manager;
	
	public void gravar(Produto produto){
		manager.persist(produto);
	}
}
