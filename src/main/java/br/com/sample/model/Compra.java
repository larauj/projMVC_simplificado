package br.com.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_COMPRA")
public class Compra {
    
	public Compra() {}
	
	public Compra(Long quantidade, String produto, Long idproduto) {
		this.quantidade = quantidade;
		this.produto = produto;
		this.produtoId = idproduto;
	}
	
	@Id
    @GeneratedValue
    private long carrinhoId;

    @Column
    private Long quantidade;

    @Column
    private String produto;

    @Column
    private long produtoId;
    
	public long getCarrinhoId() {
		return carrinhoId;
	}

	public void setCarrinhoId(long carrinhoId) {
		this.carrinhoId = carrinhoId;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(long produtoId) {
		this.produtoId = produtoId;
	}
}