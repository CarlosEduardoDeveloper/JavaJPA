package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {
	
	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi REDMI", "Muito legal", new BigDecimal ("800"), celulares);
				
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao ProdutoDao = new ProdutoDao(em);	
		CategoriaDao CategoriaDao = new CategoriaDao(em);	
		
		em.getTransaction().begin();
		
		CategoriaDao.cadastrar(celulares);
		ProdutoDao.cadastrar(celular);
		
		em.getTransaction().commit();
		em.close();
		
		
	}

}
