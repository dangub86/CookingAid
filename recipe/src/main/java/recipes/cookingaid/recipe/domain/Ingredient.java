package recipes.cookingaid.recipe.domain;

import java.util.List;

public record Ingredient(
        long id,
        String name,
        List<Recipe> recipes
) {
}
