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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((tipoPreço == null) ? 0 : tipoPreço.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarrinhoItem other = (CarrinhoItem) obj;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (tipoPreço != other.tipoPreço)
			return false;
		return true;
	}
}
