package recipes.cookingaid.recipe.domain;

public record RecipeStep(
        long id,
        long recipeId,
        String title,
        String description,
        boolean isOptional
) {
}
