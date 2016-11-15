package br.com.tarefas.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String descrcao;
	private boolean finalizado;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataFinalizacao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescrcao() {
		return descrcao;
	}
	public void setDescrcao(String descrcao) {
		this.descrcao = descrcao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	
	

}
