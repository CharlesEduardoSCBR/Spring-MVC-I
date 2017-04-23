package org.springmvci.loja.daos;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springmvci.loja.models.Produto;
import org.springmvci.loja.models.TipoPreco;

@Repository
@org.springframework.transaction.annotation.Transactional
public class ProdutoDAO {

	@PersistenceContext
	EntityManager manager;

	public void gravar(Produto produto) {
		manager.persist(produto);
	}

	public List<Produto> listar() {
		return manager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}

	public Produto find(Integer id) {
		return manager.createQuery("select distinct(p) from Produto p join fetch p.precos precos where p.id = :id",
				Produto.class).setParameter("id", id).getSingleResult();
	}

	public BigDecimal somaPrecosPorTipo(TipoPreco tipoPreco) {
		TypedQuery<BigDecimal> query = manager.createQuery(
				"select sum(preco.valor) from Produto p " + " join p.precos preco where preco.tipo = :tipoPreco",
				BigDecimal.class);
		query.setParameter("tipoPreco", tipoPreco);

		return query.getSingleResult();
	}
}
