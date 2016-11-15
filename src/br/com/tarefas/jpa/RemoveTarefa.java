package br.com.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tarefas.modelo.Tarefa;

public class RemoveTarefa {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa encontrada = manager.find(Tarefa.class, 5L);
		
		if(encontrada != null){
			manager.getTransaction().begin();
			manager.remove(encontrada);
			manager.getTransaction().commit();
		}else
			System.out.println("não encontrado");
		
		manager.close();
	}

}
