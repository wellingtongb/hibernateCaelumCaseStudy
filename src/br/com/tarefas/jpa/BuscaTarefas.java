package br.com.tarefas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.tarefas.modelo.Tarefa;

public class BuscaTarefas {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		//FAZENDO UMA BUSCA NA tabela taredas, e seto o where com um paramentro que setado no setParameter
		Query query = manager.createQuery("select t from Tarefa as t "
				+ "where t.finalizado = :paramFinalizado");
		query.setParameter("paramFinalizado", true);
		
		//lista para receber os resultados da busca
		@SuppressWarnings("unchecked")
		List<Tarefa> lista = query.getResultList();
		
		//for percorendo a lista e printando
		for (Tarefa t : lista) {
			System.out.println(t.getDescrcao());
		}
		
	}
}
