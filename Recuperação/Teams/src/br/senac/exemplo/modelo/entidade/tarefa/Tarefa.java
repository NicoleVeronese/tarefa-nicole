package br.senac.exemplo.modelo.entidade.tarefa;
import br.senac.exemplo.modelo.enumeracao.situacao.Situacao;

public class Tarefa {
	
	private Long id;
	private String nome;
	private String descricao;
	private String material;
	private Situacao situacao;
	
	protected Tarefa(Long id, String nome, String descricao, String material, Situacao situacao) {
		this.id = id;
		this.nome = nome;
		this.descricao= descricao;
		this.material = material;
		this.situacao = situacao;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean equals(Object objeto) {
		if (objeto == null)
			return false;
		if (this == objeto)
			return true;
		if (this.getClass() != objeto.getClass())
			return false;

		Tarefa tarefa = (Tarefa) objeto;

		return this.getId() == tarefa.getId()
				&& this.getNome().equals(tarefa.getNome())
				&& this.getDescricao().equals(tarefa.getDescricao()) 
				&& this.getMaterial().equals(tarefa.getMaterial())
				&& this.getSituacao().equals(tarefa.getSituacao());
	}
}