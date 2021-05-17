package br.com.infnet.app.comida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.infnet.app.comida.models.Data;
import br.com.infnet.app.comida.services.ComidaService;

@EnableFeignClients
@Controller
public class HomeController {
    
    @Autowired
    private ComidaService comidaService;


    @RequestMapping("/")
    public String listaComida(Model model){
        Data data = comidaService.pegarCategorias();
        model.addAttribute("categories", data.getCategories());
        return "home";
    }
}
