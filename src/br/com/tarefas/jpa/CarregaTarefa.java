package br.com.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tarefas.modelo.Tarefa;

public class CarregaTarefa {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa encontrada = manager.find(Tarefa.class, 3L);		
		
		System.out.println(encontrada.getDescrcao());
		
		manager.close();
		
	}
}
