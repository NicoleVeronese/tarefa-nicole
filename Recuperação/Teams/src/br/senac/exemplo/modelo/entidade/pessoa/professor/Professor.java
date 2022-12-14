package br.senac.exemplo.modelo.entidade.pessoa.professor;

import java.util.ArrayList;
import java.util.List;

import br.senac.exemplo.modelo.entidade.pessoa.Pessoa;
import br.senac.exemplo.modelo.entidade.tarefa.Tarefa;

public class Professor extends Pessoa {

	private Long id;
	private List<Tarefa> tarefas;

	public Professor(String nome, String email, String senha, Long id) {
		super(nome, email, senha);
		this.id = id;
		tarefas = new ArrayList<Tarefa>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public boolean adicionarTarefa(Tarefa tarefa) {
		return tarefas.add(tarefa);
	}

	public boolean removerTarefa(Tarefa tarefa) {
		return tarefas.remove(tarefa);
	}

	public boolean equals(Object objeto) {
		if (objeto == null)
			return false;
		if (this == objeto)
			return true;
		if (this.getClass() != objeto.getClass())
			return false;

		Professor professor = (Professor) objeto;

		return this.getId() == professor.getId() && this.getNome().equals(professor.getNome())
				&& this.getEmail().equals(professor.getEmail()) && this.getSenha().equals(professor.getSenha())
				&& this.getTarefas().equals(professor.getTarefas());
	}
}
