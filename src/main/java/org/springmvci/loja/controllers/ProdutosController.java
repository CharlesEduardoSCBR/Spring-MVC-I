package org.springmvci.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos/form")
	public String form(){
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String gravar(String titulo, String descricao, int paginas){
		System.out.println("Titulo.: " + titulo);
		System.out.println("Descricao.:" + descricao);
		System.out.println("Pagina.:" + paginas);
		return "produtos/ok";
	}
}
