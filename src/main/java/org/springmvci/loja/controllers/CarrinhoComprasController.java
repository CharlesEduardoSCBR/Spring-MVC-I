package org.springmvci.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springmvci.loja.daos.ProdutoDAO;
import org.springmvci.loja.models.CarrinhoCompras;
import org.springmvci.loja.models.CarrinhoItem;
import org.springmvci.loja.models.Produto;
import org.springmvci.loja.models.TipoPreco;

@Controller
@RequestMapping("/carrinho")
@Scope(value=WebApplicationContext.SCOPE_REQUEST)
public class CarrinhoComprasController {

	@Autowired
	private ProdutoDAO produtoDAO;
	
	@Autowired
	private CarrinhoCompras carrinho;
	
	@RequestMapping("/add")
	public ModelAndView add(Integer produtoId, TipoPreco tipoPreco){
		ModelAndView modelAndView = new ModelAndView();
		CarrinhoItem carinhoItem = criaItem(produtoId, tipoPreco);
		return modelAndView;
	}
	
	private CarrinhoItem criaItem(Integer produtoId, TipoPreco tipoPreco){
		Produto produto = produtoDAO.find(produtoId);
		CarrinhoItem carrinhoItem = new CarrinhoItem(produto, tipoPreco);		
		
		return carrinhoItem;
	}
	
	public ModelAndView remover(Integer produtoId, TipoPreco tipoPreco){
		carrinho.remover(produtoId, tipoPreco);
		return new ModelAndView("redirect:/carrinho");
	}
}
