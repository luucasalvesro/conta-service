package com.conta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Table(name="Conta")
@Entity
public class ContaModel {
	
	@Id
	@Column(name="id")
	private int id;
 
	@Column(name="nome")
	private String nome;
 
	@Column(name="saldo")
	private double saldo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_abertura_da_conta")
	private Date dataconta;
 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Date getDataconta() {
		return dataconta;
	}
	public void setDataconta(Date dataconta) {
		this.dataconta = dataconta;
	}
}