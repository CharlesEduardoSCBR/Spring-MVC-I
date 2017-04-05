package org.springmvci.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springmvci.loja.daos.ProdutoDAO;
import org.springmvci.loja.models.Produto;
import org.springmvci.loja.models.TipoPreco;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("/produtos/form")
	public ModelAndView form(){
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		
		return modelAndView;
	}
	
	@RequestMapping(value="/produtos", method = RequestMethod.POST)
	public String gravar(Produto produto){
		produtoDAO.gravar(produto);
		
		return "produtos/ok";
	}
	
	@RequestMapping(value="/produtos", method = RequestMethod.GET)
	public ModelAndView listar(){
		List<Produto> produtos = produtoDAO.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtos);
		
		return modelAndView;
	}
}
