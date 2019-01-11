package br.com.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.sample.services.CarrinhoService;
import br.com.sample.services.ProdutoService;

@Controller
@RequestMapping("/mvc/home")
public class HomeController {
    
	@Autowired
    ProdutoService produtoService;
	
	@Autowired
    CarrinhoService carrinhoService;

	 @RequestMapping(method=RequestMethod.GET)
	    public String produtos(Model model) {
	        model.addAttribute("produtos", produtoService.getAll());
	        return "home/home";
	 }

    @RequestMapping(value = "/content",  method=RequestMethod.GET)
    public String testContent() {
        return "content";
    }

}
