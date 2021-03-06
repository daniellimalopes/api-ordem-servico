package com.daniel.os.core.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1,"Pessoa Fisica"), 
	PESSOAJURIDICA(2,"Pessoa Juridica");
	

	private Integer cod;
	private String descricao;

	private TipoCliente(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	public static TipoCliente toenum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Prioridade Invalida!!!");
		
	}

	public static TipoCliente toenum(String descricao) {
		if(descricao == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(descricao.equals(x.getDescricao())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido" + descricao);
		
	}


	
}

