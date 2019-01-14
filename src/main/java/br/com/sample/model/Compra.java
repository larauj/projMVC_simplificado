package br.com.sample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_COMPRA")
public class Compra {
    
	public Compra() {}
	
	public Compra(Long qtTotalItens, Double valorCompra) {
		this.qtTotalItens = qtTotalItens;
		this.valorCompra = valorCompra;
	}
	
	@Id
    @GeneratedValue
    private long compraId;

    @Column
    private Long qtTotalItens;
	
    @Column
    private Double valorCompra;

    @Column
    private Date dtCompra = new Date();

	public long getCompraId() {
		return compraId;
	}

	public void setCompraId(long compraId) {
		this.compraId = compraId;
	}

	public Long getQtTotalItens() {
		return qtTotalItens;
	}

	public void setQtTotalItens(Long qtTotalItens) {
		this.qtTotalItens = qtTotalItens;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Date getDtCompra() {
		return dtCompra;
	}

	public void setDtCompra(Date dtCompra) {
		this.dtCompra = dtCompra;
	}

    
    
}