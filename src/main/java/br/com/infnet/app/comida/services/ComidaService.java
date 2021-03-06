package br.com.infnet.app.comida.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.app.comida.models.Categories;

/*
    API não tem uma lista de pratos.
 */
@FeignClient(url = "https://www.themealdb.com/api/json/v1/1/", name="ComidaService")
public interface ComidaService {
    @GetMapping("categories.php")
    Categories pegarCategorias();

    @GetMapping(value = "filter.php?c=${nomeCategoria}")
    Categories pegarPratosPorCategoria(@PathVariable("nomeCategoria") String nomeCategoria);
}