package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

public class ProdutoDao {
	
	private EntityManager em;
		
	public ProdutoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Produto produtos) {
		this.em.persist(produtos);
	}	
	
}
