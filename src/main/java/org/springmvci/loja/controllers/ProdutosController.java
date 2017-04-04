package org.springmvci.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmvci.loja.models.Produto;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos/form")
	public String form(){
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String gravar(Produto produto){
		System.out.println("Titulo.: " + produto.getTitulo());
		System.out.println("Descricao.:" + produto.getDescricao());
		System.out.println("Pagina.:" + produto.getPaginas());
		return "produtos/ok";
	}
}
