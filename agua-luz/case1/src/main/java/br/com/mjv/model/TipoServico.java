package br.com.mjv.model;

public enum TipoServico {
	AGUA("água"), LUZ("energia");

	private String descricao;

	private TipoServico(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
		
	

}
