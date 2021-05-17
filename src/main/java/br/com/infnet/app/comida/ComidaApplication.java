package br.com.infnet.app.comida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import br.com.infnet.app.comida.models.Category;
import br.com.infnet.app.comida.models.Data;
import br.com.infnet.app.comida.services.ComidaService;

@SpringBootApplication
//@EnableFeignClients
public class ComidaApplication { //implements CommandLineRunner
	/*@Autowired
	private ComidaService comidaService;*/

	public static void main(String[] args) {
		SpringApplication.run(ComidaApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("Categorias:");
		Data lista = comidaService.pegarCategorias();
		for (Category category : lista.getCategories()) {
			System.out.println(category.getStrCategory());
		}

	}*/

}