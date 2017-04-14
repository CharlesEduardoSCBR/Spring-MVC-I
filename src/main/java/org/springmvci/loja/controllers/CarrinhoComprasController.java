package org.springmvci.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springmvci.loja.daos.ProdutoDAO;
import org.springmvci.loja.models.CarrinhoItem;
import org.springmvci.loja.models.Produto;
import org.springmvci.loja.models.TipoPreco;

@Controller
@RequestMapping("/carrinho")
public class CarrinhoComprasController {

	@Autowired
	private ProdutoDAO produtoDAO;
	
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
}
