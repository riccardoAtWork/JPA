package com.fire.jpa.auto;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CAMPO database table.
 * 
 */
@Entity
@NamedQuery(name="Campo.findAll", query="SELECT c FROM Campo c")
public class Campo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CAMPO_ID_GENERATOR", sequenceName="CAMPO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, 
	generator="CAMPO_ID_GENERATOR")
	private long id;

	private BigDecimal coperto;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_RIFACIMENTO")
	private Date dataRifacimento;

	private String nome;

	private String stato;

	private String tipo;

	

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCoperto() {
		return this.coperto;
	}

	public void setCoperto(BigDecimal coperto) {
		this.coperto = coperto;
	}

	public Date getDataRifacimento() {
		return this.dataRifacimento;
	}

	public void setDataRifacimento(Date dataRifacimento) {
		this.dataRifacimento = dataRifacimento;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStato() {
		return this.stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}