package br.com.dishup.object;

public class EventoVO {

	private int id;
	private String nome;
	private String descricao;
	
	public EventoVO(){
		
	}

	public EventoVO(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return "EVENTO ID("+id+") NOME("+nome+") DESCRICAO("+descricao+")";
	}
}
