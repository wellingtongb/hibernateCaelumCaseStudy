package br.com.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.omg.CORBA.PRIVATE_MEMBER;

import br.com.tarefas.modelo.Tarefa;

public class AtualizaDescricao {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		long qualId = 6;		//qual id será atualizada
		
		Tarefa tarefa = new Tarefa();
		tarefa.setId(qualId);
		
		tarefa.setDescrcao("Teste de update de campo");
		tarefa.setFinalizado(false);
		tarefa.setDataFinalizacao(null);
		
		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();
		
		
		Tarefa encontrada = manager.find(Tarefa.class, qualId);		
		
		System.out.println(encontrada.getDescrcao());
		System.out.println(encontrada.isFinalizado());
		System.out.println(encontrada.getDataFinalizacao());
		
		manager.close();
		
	}

}
