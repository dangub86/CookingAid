package recipes.cookingaid.recipe.domain;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public record Recipe(
        long id,
        String name,
        List<String> tags,
        Map<Integer, Ingredient> ingredients,
        List<Ingredient> optionalIngredients,
        Ingredient mainIngredient,
        String description,
        List<RecipeStep> steps,
        LocalDate date) {
}
