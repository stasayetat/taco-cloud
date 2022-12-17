package food;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import food.Ingredient.Type;

@SpringBootApplication
public class FoodCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodCloudApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner dataLoader(IngredientRepository rep) {
		return args -> {
			 rep.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
			 rep.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
			 rep.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
			 rep.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
			 rep.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
			 rep.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
			 rep.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
			 rep.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
			 rep.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
			 rep.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
			 };
	}

}


