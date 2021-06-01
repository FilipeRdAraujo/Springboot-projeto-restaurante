package br.com.infnet.app.comida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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