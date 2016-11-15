package br.com.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tarefas.modelo.Tarefa;

public class AdicionaTarefa {

	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		tarefa.setDescrcao("Criar aplica��o completa utilizando MysqlLite");
		tarefa.setFinalizado(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		
		System.out.println("Id da tarefa " + tarefa.getId());
		
		manager.close();
	}
}
