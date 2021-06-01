package br.com.infnet.app.comida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.infnet.app.comida.models.Categories;
import br.com.infnet.app.comida.services.ComidaService;

@EnableFeignClients
@Controller
public class HomeController {
    
    @Autowired
    private ComidaService comidaService;
    
    @RequestMapping("/")
    public String listaComida(Model model){
        Categories data = comidaService.pegarCategorias();
        model.addAttribute("categories", data.getCategories());
        return "home";
    }

    @PostMapping("/pratos")
    public String filtarPorCategoria(String nomeCategoria, Model model){
        Categories data = comidaService.pegarPratosPorCategoria(nomeCategoria);
        //model.addAttribute("pratos", data);
        return "pratos";
    }
}
