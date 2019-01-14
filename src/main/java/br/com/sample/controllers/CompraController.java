package br.com.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.sample.model.Carrinho;
import br.com.sample.services.CarrinhoService;


@Controller
@RequestMapping("/mvc/compra")
public class CompraController {
    
	
	@Autowired
    CarrinhoService carrinhoService;
		 
  
}
