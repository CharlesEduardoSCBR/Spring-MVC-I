package org.springmvci.loja.models;

public class CarrinhoItem {

	private Produto produto;
	private TipoPreco tipoPreço;
	
	public CarrinhoItem(Produto produto, TipoPreco tipoPreco) {
		this.produto = produto;
		this.tipoPreço = tipoPreco;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public TipoPreco getTipoPreço() {
		return tipoPreço;
	}
	public void setTipoPreço(TipoPreco tipoPreço) {
		this.tipoPreço = tipoPreço;
	}
	
	
}
