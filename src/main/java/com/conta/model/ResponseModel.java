package com.conta.model;

public class ResponseModel {
	 
	private Integer id;
	private String mensagem;
 
	public ResponseModel() {}
 
	public ResponseModel(Integer id, String mensagem) {
		this.id   = id;
		this.mensagem =  mensagem;
	}
 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMensagem() {
		return mensagem;
	}
 
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	
	}
	
}
 
