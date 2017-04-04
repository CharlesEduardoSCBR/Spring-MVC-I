package org.springmvci.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springmvci.loja.models.Produto;

public class ProdutoDAO {

	@PersistenceContext
	EntityManager manager;
	
	public void gravar(Produto produto){
		manager.persist(produto);
	}
}
