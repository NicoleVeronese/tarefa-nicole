package br.senac.exemplo.modelo.entidade.pessoa.aluno;
import br.senac.exemplo.modelo.entidade.pessoa.Pessoa;

public class Aluno extends Pessoa {
	
	private Long id;

	public Aluno(String nome, String email, String senha, Long id) {
		super(nome, email, senha);
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public boolean equals(Object objeto) {
		if (objeto == null)
			return false;
		if (this == objeto)
			return true;
		if (this.getClass() != objeto.getClass())
			return false;

		Aluno aluno = (Aluno) objeto;

		return this.getId() == aluno.getId() 
				&& this.getNome().equals(aluno.getNome())
				&& this.getEmail().equals(aluno.getEmail()) 
				&& this.getSenha().equals(aluno.getSenha());
	}
}
